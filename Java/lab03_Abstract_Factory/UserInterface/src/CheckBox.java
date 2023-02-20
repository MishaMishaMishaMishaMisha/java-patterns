import java.awt.*;

abstract public class CheckBox {
    public CheckBox(int id) {
        this.id = id;
        this.checked = false;
    }

    final protected int id;
    protected boolean checked;

    public void setChecked(boolean checked){
        this.checked = checked;
        System.out.printf("Checked '%s' is checked = %s\n", id, this.checked);
    }
}
