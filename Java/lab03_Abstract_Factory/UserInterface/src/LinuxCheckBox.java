public class LinuxCheckBox extends CheckBox {
    public LinuxCheckBox(int id) {
        super(id);
    }
    @Override
    public void setChecked(boolean checked){
        this.checked = checked;
        System.out.printf("Linux Checked '%s' is checked = %s\n", id, this.checked);
    }
}
