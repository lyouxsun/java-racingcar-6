# ♻️ 코드 실행 흐름
1. Application.class의 main() 에서 Racing객체 생성
2. Racing.setting()에서 이름, 횟수 입력받기
3. Raging.play() 실행
   - 자동차 개수만큼 객체 만들기


# 💠 각 클래스들 구성

## 🥇 Racing
- `int carNum` : 자동차 개수 저장하는 변수
- `int cycleNum` : 사용자가 입력한 자동차 전진 횟수
- for문 돌려서 횟수만큼 각 자동차들의 goStop() 진행하기
- `whoIsWinner()` : 제일 멀리 간 자동차 판별, 출력

## 🏎️ Car
- `distance` : 지금까지의 위치(얼마나 이동했는지)를 저장하는 변수
- `goStop()` : Random으로 수 가져오기 -> 4보다 크면 distance++
- `getDistance()` : process, winner를 파악하는데 필요

## 🎫 PrintProcess
- 각 객체들의 distance만큼 -를 출력하는 메서드
