package WalkoMan;

import com.sun.javafx.geom.BaseBounds;
import com.sun.javafx.geom.transform.BaseTransform;
import com.sun.javafx.jmx.MXNodeAlgorithm;
import com.sun.javafx.jmx.MXNodeAlgorithmContext;
import com.sun.javafx.sg.prism.NGNode;
import javafx.scene.Node;

public class Man extends Node {
    int xCoord;
    int yCoord;

    public Man(int X, int Y){
        yCoord = Y;
        xCoord = X;
    }

    public void move(String direction){
        if(direction.equals("up")){
            yCoord = yCoord - 1;
        }

        if(direction.equals("down")){
            yCoord = yCoord + 1;
        }

        if(direction.equals("left")){
            xCoord = xCoord + 1;
        }

        if(direction.equals("right")){
            xCoord = xCoord - 1;
        }
    }

    public int getX(){
        return xCoord;
    }

    public int getY(){
        return yCoord;
    }

    @Override
    protected NGNode impl_createPeer() {
        return null;
    }

    @Override
    public BaseBounds impl_computeGeomBounds(BaseBounds bounds, BaseTransform tx) {
        return null;
    }

    @Override
    protected boolean impl_computeContains(double localX, double localY) {
        return false;
    }

    @Override
    public Object impl_processMXNode(MXNodeAlgorithm alg, MXNodeAlgorithmContext ctx) {
        return null;
    }
}
