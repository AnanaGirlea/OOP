package data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class OutputYear {

    @JsonProperty("children")
    private List children;

    public OutputYear(final List outputYear) {
        this.children = outputYear;
    }

    /**
     * getter pentru lista children in care se retin toati copiii de tip output
     * @return
     */
    public List getChildren() {
        return children;
    }

    /**
     * setter pentru lista children in care se retin toati copiii de tip output
     * @param children
     */
    public void setChildren(final List children) {
        this.children = children;
    }
}
