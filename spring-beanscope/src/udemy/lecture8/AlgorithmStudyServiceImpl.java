package udemy.lecture8;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class AlgorithmStudyServiceImpl implements StudyService {
    @Override
    public String getWhatAreYouDoing() {
        return "알고리즘 공부를 하고 있습니다.";
    }

    @Override
    public int getProgress() {
        return new Random().nextInt(101);
    }
}
