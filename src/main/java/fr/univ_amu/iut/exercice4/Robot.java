package fr.univ_amu.iut.exercice4;


public class Robot {
    private GridPosition gridPosition;
    private Orientation orientation;

    public Robot(GridPosition gridPosition, Orientation orientation) {
        this.gridPosition=gridPosition;
        this.orientation=orientation.SOUTH;
    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void turnRight(){ this.orientation=Orientation.WEST;
    }

    public void turnLeft() {
        this.orientation=Orientation.WEST;
    }

    public void advance() {
        throw new RuntimeException("Not yet implemented !");
    }
}

