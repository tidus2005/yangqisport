package cn.tidux.xjbcoding.genesample1;

import java.util.List;
import java.util.Random;

class UnitPair {
    private Unit left;
    private Unit right;

    public boolean pair(List<Unit> units) {

        if (units == null || units.size() == 0 || units.size() % 2 == 1) {
            return false;
        }

        Random random = new Random();
        left = units.get(random.nextInt(units.size()));
        units.remove(left);

        right = units.get(random.nextInt(units.size()));
        units.remove(right);

        return true;
    }

    public void cross() {
        Random random = new Random();
        int crossPoint = random.nextInt(left.getGeneStr().length());

        //swap
        //10|0111   1|00011  1|10110
        //01|0011   0|10110  0|00011

        String leftGeneStrA = left.getGeneStr().substring(0, crossPoint);
        String leftGeneStrB = left.getGeneStr().substring(crossPoint);

        String rightGeneStrA = right.getGeneStr().substring(0, crossPoint);
        String rightGeneStrB = right.getGeneStr().substring(crossPoint);

        String newLeftGeneStr = leftGeneStrA + rightGeneStrB;
        String newRightGeneStr = rightGeneStrA + leftGeneStrB;

        left.rebuild(newLeftGeneStr);
        right.rebuild(newRightGeneStr);
    }

    public Unit getLeft() {
        return left;
    }

    public void setLeft(Unit left) {
        this.left = left;
    }

    public Unit getRight() {
        return right;
    }

    public void setRight(Unit right) {
        this.right = right;
    }

}