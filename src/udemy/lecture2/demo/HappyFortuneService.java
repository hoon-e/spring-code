package udemy.lecture2.demo;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "오늘은 운이 좋을 것 같네요~?";
    }
}
