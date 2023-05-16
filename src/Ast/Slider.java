package Ast;

import Ast.Classes.HtmlElement;

import java.util.ArrayList;
import java.util.List;

public class Slider extends HtmlElement {
    //---------------------------    Attributes     -------------------------------
    private List<SliderArgs> sliderArgs;

    //---------------------------    Constructor     -------------------------------
    public Slider() {
        this.sliderArgs = new ArrayList<>();
    }

    //---------------------------    Setters & Getters     -------------------------------
    public List<SliderArgs> getSliderArgs() {
        return sliderArgs;
    }

    public void setSliderArgs(List<SliderArgs> sliderArgs) {
        this.sliderArgs = sliderArgs;
    }

    //---------------------------    Override Func     -------------------------------
    @Override
    public String toString() {
        return "Slider{" +
                "sliderArgs=" + sliderArgs +
                '}';
    }

    @Override
    public String generateHtmlAttribute() {
        return "";
    }

    @Override
    public String generateHtmlCode() {
        return "";
    }
}
