package com.kim;

import java.util.ArrayList;
import java.util.List;

//setting upper bound to indicate that anything
// that is mappable uses this class
public class Layer<T extends Mappable>{

    private List<T> layerElements;


    /*
    I'll change that List T in angle brackets to

    just a T square brackets. I want to create the list

    as an ArrayList in the constructor of type T.
    This constructor lets the calling code pass an
    array to create a new Layer
   */
    public Layer(T[] layerElements) {
        this.layerElements = new ArrayList<T>(List.of(layerElements));
    }

    public void addElements(T... elements){
        layerElements.addAll(List.of(elements));
    }

    public void renderLayer(){
        for(T element : layerElements){
            element.render();
        }
    }
}
