#휴스타 프로젝트 2조(밥조) - 인공지능 기술이 적용된 레시피 추천 시스템 (앱)

###프로젝트 기능
1. 이미지 인식기반 식재료 등록
: 직접 사진을 찍거나 갤러리 이미지를 가져오기
-> tensorflow lite 학습모델을 이용하여 객체 감지
-> 인식된 재료의 이름 자동 출력
-> 식재료 전송 버튼으로 사용자의 db에 저장

2. 식재료 기반 레시피 추천
: 로그인한 이용자에 저장되어 있는 식재료로 만들 수 있는 레시피 출력
-> 쿼리문을 활용하여 이용자의 데이터베이스 안에 있는 식재료들을 포함하는 레시피를 출력