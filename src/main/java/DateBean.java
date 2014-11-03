import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.Date;

@ManagedBean
public class DateBean implements Serializable{
    private Date date;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}