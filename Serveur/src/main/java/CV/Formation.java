package CV;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by baaliham on 16/04/15.
 */

@XmlRootElement(name = "CV.Formation")
public class Formation {

    private String date ;
    private String diplome;

    public String getDate() {
        return date;
    }

    @XmlElement
    public void setDate(String date) {
        this.date = date;
    }

    public String getDiplome() {
        return diplome;
    }

    @XmlElement
    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public Formation() {
    }

    public Formation(String date, String diplome) {
        this.date = date;
        this.diplome = diplome;
    }

}
