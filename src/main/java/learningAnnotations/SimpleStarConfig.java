////////////////////////
// TITLE: SimpleStarConfig
// AUTHOR: lego
// DATE: 2019-11-05
// PURPOSE: To figure out how to use Jackson annotations
////////////////////////
package learningAnnotations;


import com.fasterxml.jackson.annotation.JsonProperty;

class SimpleStarConfig {

    @JsonProperty
    String rightAscension;
    @JsonProperty
    String declination;


    public String toString() {
        return rightAscension + " " + declination;
    }


    public static void main(String[] args) {
        SimpleStarConfig simpleStarConfig = new SimpleStarConfig();
        System.out.println(simpleStarConfig);



    }
}
