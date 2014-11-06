import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;
import java.util.ResourceBundle;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

@ManagedBean
@SessionScoped
public class Login implements Serializable {
    private int defaultShopCount;
    private ArrayList<String> shopItem;
    private String selectItem = "";
    private ResourceBundle bundle;

    private ResourceBundle getBundle() {
        if (bundle == null) {
            FacesContext context = FacesContext.getCurrentInstance();
            bundle = context.getApplication().getResourceBundle(context, "shps");
        }
        return bundle;
    }

    private void fillShopItem() {
        int countShop = Integer.parseInt(getBundle().getString("countShop"));
        shopItem = new ArrayList<String>();
        for (int i = 0; i < countShop; i++) {
            shopItem.add(getBundle().getString("name" + i));
        }
    }

    public Login() {
        fillShopItem();
    }

    public String getSelectItem() {
        return selectItem;
    }

    public void setSelectItem(String selectItem) {
        this.selectItem = selectItem;
    }

    public void setShopItemsValue(String value) {
        selectItem = value;
    }

    public ArrayList<String> getShopItemsValue() {
        return shopItem;
    }
}
