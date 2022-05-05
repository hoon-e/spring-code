package udemy.lecture2.demo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
    private String[] randomFortune = {
        "운이 좋을거에요!",
        "운이 굉장히 좋을거에요!",
        "이렇게 좋아도 되나 싶을정도로 운이 좋을거에요!"
    };

    @Override
    public String getFortune() {
        int rand = new Random().nextInt(1000);
        return randomFortune[rand % 3];
    }
}
