public class WinCheckBox extends CheckBox {
    public WinCheckBox(int id) {
        super(id);
    }
    @Override
    public void setChecked(boolean checked){
        this.checked = checked;
        System.out.printf("Window Checked '%s' is checked = %s\n", id, this.checked);
    }
}
