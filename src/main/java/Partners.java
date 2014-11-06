
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class Partners implements Serializable {
    private ArrayList<String> partnerArrayList;

    public Partners() {
        partnerArrayList = new ArrayList<String>();
        partnerArrayList.add("Отчет по всем поставщикам");
    }

    public ArrayList<String> getPartnerArrayList() {
        return partnerArrayList;
    }

    public void setPartnerArrayList(ArrayList<String> partnerArrayList) {
        this.partnerArrayList = partnerArrayList;
    }
}
