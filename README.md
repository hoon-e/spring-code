# Spring 5 & Hibernate 연습 코드

[Spring & Hibernate](https://www.udemy.com/course/spring-hibernate-tutorial/) 강의 코드 연습 레포지토리

## Spring 개발 환경 세팅
- lib : Spring 라이브러리 추가 폴더
  - [Spring 공식 Repo](https://repo.spring.io/ui/repos/tree/General/)
  - [Spring 5.3.9 Dist File Download URL](https://repo.spring.io/artifactory/libs-release/org/springframework/spring/5.3.9/spring-5.3.9-dist.zip)
    - 해당 압축 해제 후 library들을 lib 폴더 아래에 위치
  - IntelliJ build library 추가
    - Module Setting > Library > lib 폴더 경로 추가
  - IntelliJ에서 src 폴더에 패키지 생성되지 않는 경우
    - 프로젝트 source 폴더로 인식하지 못해서 발생함
    - src 디렉토리 생성 후 module setting에서 src를 source directory로 설정해줌
- 새로운 프로젝트 생성하지 않고 프로젝트 아래에 강좌 별로 모듈 프로젝트 구성 변경
  - Module Setting > Library > lib 폴더로 라이브러리 경로 추가해주어야 상위 폴더에 있는 jar 파일들 사용 가능

## History
- 22/05/07 : BeanScope 및 BeanLifecycle 개념 학습 및 데모 코드 추가
- 22/05/03 : Dependency Injection 개념 학습 및 데모 코드 추가
- 22/05/02 : 기본 Spring Container 개념 학습 및 데모 코드 추가
  - xml 파일 경로 못찾는 이슈 발생 시 : ApplicationContext 파일을 src 디렉토리 가장 상위에 둔다.
  - bean context가 xml 파일에 존재하지 않는 경우 아래 에러 메세지가 발생한다.
    ```text
    Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'myCoach' available
    ```