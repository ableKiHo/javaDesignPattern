package CH4.CREATE_PATTERN.adapter.web;

public class OldWebRequester implements WebRequester {
    @Override
    public void requestHandler() {
        System.out.println("OldWebRequester is working");
    }
}
