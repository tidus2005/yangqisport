package cn.tidux.xjbcoding.genesample1;

/**
 * Project: xmlSignTest
 * 
 * File Created at 2016�?12�?29�?
 * $Id$
 * 
 * Copyright 2008 Alibaba.com Corporation Limited.
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * Alibaba Company. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Alibaba.com.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;
import java.util.Random;

import javax.swing.JFrame;

/**
 * TODO Comment of GeneMain xxxx
 * 
 * @author Administrator
 */
public class GeneMain extends JFrame {

    public static int   unitNum       = 4;
    public static int   maxGeneration = 10000;
    public static int[] st            = { 1, 2, 3, 4, 5, 6, 7 };
    private Observer    observer;
    private ShowPanel   showPanel     = new ShowPanel();

    /**
     * @param args
     */
    public static void main(String[] args) {
        //1,设置个群集起始群
        //2,确定适应函数, 目标搜索
        //3,计算适应概率
        //4,选择
        //5,交叉
        //6,变异

        GeneMain geneMain = new GeneMain();
        System.out.println("===============================");

    }

    public GeneMain() {

        setDefaultCloseOperation(3);
        setSize(500, 500);
        setVisible(true);
        getContentPane().add(this.showPanel);
        setObserver(showPanel);

        for (int currentGeneration = 0; currentGeneration < maxGeneration; currentGeneration++) {
            List<Unit> units = new ArrayList<Unit>();
            int sumFitVal = 0;
            for (int i = 0; i < unitNum; i++) {
                Unit unit = new Unit(st);
                sumFitVal += unit.getFitVal();
                units.add(unit);
            }

            for (Unit unit : units) {
                unit.evaluationFitRate(sumFitVal);
            }

            display(units, currentGeneration, sumFitVal);

            List<Unit> nextGenUnits = new ArrayList<Unit>();
            //选择
            nextGenUnits = choose(units);

            //交叉
            nextGenUnits = cross(units);
            //sss

            //变异
            //nextGenUnits = genovariation(units);

            units = nextGenUnits;
        }

    }

    private List<Unit> cross(List<Unit> units) {
        List<Unit> crossUnits = new ArrayList<Unit>();
        UnitPair unitPair = new UnitPair();
        while (unitPair.pair(units)) {
            unitPair.cross();
            crossUnits.add(unitPair.getLeft());
            crossUnits.add(unitPair.getRight());
        }

        return crossUnits;
    }

    private List<Unit> genovariation(List<Unit> units) {
        List<Unit> genovariationUnits = new ArrayList<Unit>();
        return genovariationUnits;
    }

    private List<Unit> choose(List<Unit> units) {
        List<Unit> choosedUnits = new ArrayList<Unit>();
        for (int i = 0; i < unitNum; i++) {
            double point = new Random().nextDouble();
            double start = 0;
            for (Unit unit : units) {
                if (point >= start && point < start + unit.getFitRate()) {
                    try {
                        choosedUnits.add((Unit) unit.clone());
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                    break;
                }
                start += unit.getFitRate();
            }
        }
        return choosedUnits;
    }

    private void display(List<Unit> units, int currentGeneration, double sumFitVal) {
        System.out.println(String.format(
                "---------- CURRENT GENERATION : %s ,  SumFitVal: %s ---------- ",
                currentGeneration, sumFitVal));
        this.observer.update(null, new Double(sumFitVal));
        for (Unit unit : units) {
            //System.out.println(unit);
        }
        //        System.out.println("------------ ");
        //      System.out.println();
    }

    public Observer getObserver() {
        return observer;
    }

    public void setObserver(Observer observer) {
        this.observer = observer;
    }

}
