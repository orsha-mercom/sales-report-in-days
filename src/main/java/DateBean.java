import javax.faces.bean.ManagedBean;
import java.io.Serializable;
import java.util.Date;

@ManagedBean
public class DateBean implements Serializable{
    private Date dateFirst = new Date();
    private Date dateEnd = new Date();

    public Date getDateFirst() {
        return dateFirst;
    }

    public void setDateFirst(Date dateFirst) {
        this.dateFirst = dateFirst;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }
}