public class PC {
    OS os;
    Browser br;
    public PC() {
        os=new Windows();
        br=new Chrome();
    }

    public void startpc(){
        os.startos();
    }

    public void openbr(){
        br.openBrowser();
    }

    public OS getOS() {
        return os;
    }

    public void setOS(OS os) {
        this.os = os;
    }

    public Browser getBr() {
        return br;
    }

    public void setBr(Browser br) {
        this.br = br;
    }
}

