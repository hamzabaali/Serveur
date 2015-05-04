package CV;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/resume")
public class XMLController {
    CuVis cuVis;

    public XMLController() {

            this.cuVis = initialiseCVList();

    }

    public static CuVis initialiseCVList(){

        CuVis kk = new CuVis();
        ArrayList<Formation> form1 = new ArrayList<Formation>();

        Formation Xp1 = new Formation( "06/06/2010", "dilpome1");
        Formation Xp2 = new Formation("06/06/2011", "diplome2");

        form1.add(Xp1);
        form1.add(Xp2);

        InformationPerso info1 = new InformationPerso("mzabi","leila", "ADAd1");

        CuVi cv1 = new CuVi(0,info1,form1);


        ArrayList<Formation> form2 = new ArrayList<Formation>();

        Formation Xp21 = new Formation( "07/06/2020", "dilpome8");
        Formation Xp22 = new Formation("06/28/2021", "diplome9");

        form2.add(Xp21);
        form2.add(Xp22);

        InformationPerso info2 = new InformationPerso("baali","hamza", "adr23");

        CuVi cv2 = new CuVi(1, info2,form2);


        kk.add(cv1);
        kk.add(cv2);
    return kk;
    }

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody
    CuVi getCVInXML(@PathVariable int id) {


        return this.cuVis.getById(id) ;

    }




    @RequestMapping(value="", method = RequestMethod.GET)
    public @ResponseBody CuVis getCVsInXML() {

        return this.cuVis;

    }


    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody void ajouterAvecPost(@RequestBody CuVi cuVi) {

        this.cuVis.add(cuVi);
    }
}