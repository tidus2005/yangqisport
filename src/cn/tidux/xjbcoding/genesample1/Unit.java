package cn.tidux.xjbcoding.genesample1;

import java.util.Random;
import java.util.UUID;

public class Unit implements Cloneable {
    private String uuid    = UUID.randomUUID().toString();
    private int    gene    = 0;
    private String geneStr = "";
    private int    x1      = 0;
    private int    x2      = 0;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    private int    fitVal  = 0;
    private double fitRate = 0d;

    public Unit(int[] st) {
        //生成显状
        x1 = new Random().nextInt(st.length);
        x2 = new Random().nextInt(st.length);

        //根据性状生成基因编码
        fitVal = evaluationFitVal(x1, x2);
        gene = x1 << 3 | x2;
        geneStr = Utils.toBinaryString(gene);

    }

    public void rebuild(String geneStr) {
        //根据基因编码重新生成显状
        x1 = Integer.valueOf(geneStr.substring(0, 3), 2);
        x2 = Integer.valueOf(geneStr.substring(3), 2);

        //根据性状生成基因编码
        fitVal = evaluationFitVal(x1, x2);
        gene = x1 << 3 | x2;
        geneStr = Utils.toBinaryString(gene);

        fitRate = 0d;
    }

    public int evaluationFitVal(int x1, int x2) {
        return (int) (Math.pow(x1, 2) + Math.pow(x2, 2));
    }

    public void evaluationFitRate(double sumFitVal) {
        fitRate = fitVal / sumFitVal;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getGene() {
        return gene;
    }

    public void setGene(int gene) {
        this.gene = gene;
    }

    public String getGeneStr() {
        return geneStr;
    }

    public void setGeneStr(String geneStr) {
        this.geneStr = geneStr;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getFitVal() {
        return fitVal;
    }

    public void setFitVal(int fitVal) {
        this.fitVal = fitVal;
    }

    public double getFitRate() {
        return fitRate;
    }

    public void setFitRate(double fitRate) {
        this.fitRate = fitRate;
    }

    @Override
    public String toString() {
        return String.format(
                "UUID:, x1: %s, x2: %s, gene: %s, geneStr: %s, fitVal: %s, fitRate: %s", x1, x2,
                gene, geneStr, fitVal, fitRate);
    }
}
