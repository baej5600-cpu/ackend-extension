
📦 1️⃣ ackend-extension

Spring Boot 기반 백엔드 확장 구조 (Swagger + API + Controller + Service 구조 완성)

📘 개요

프로젝트 목적:
Spring Boot 기반의 RESTful 백엔드 구조를 확장 가능한 형태로 세팅.
추후 CLOVA AI, OCR, Speech API, No-show 플랫폼 등 기능을 모듈 단위로 붙일 수 있도록 설계된 기본 골격 프로젝트.

개발 환경:

- Spring Boot 3.5.7
- Java 17
- Gradle 8.x (Wrapper 기반)
- Swagger(OpenAPI) + Lombok + JPA 구조 포함
- 로컬 실행 포트: 8080

- 📂 주요 디렉터리 구조
- src/main/java/com/example/backendextension/
├── controller/
│   ├── ReservationController.java     // 예약 API (GET /api/예약)
│   ├── PlaceController.java           // 장소 API (GET /api/장소)
│   ├── ReviewController.java          // 리뷰 API (GET /api/리뷰)
│   └── ShareController.java           // 공유 API (GET /api/공유)
│
├── service/
│   ├── ReservationService.java        // 예약 더미 데이터 제공
│   ├── PlaceService.java              // 장소 리스트 반환
│   ├── ReviewService.java             // 리뷰 리스트 반환
│   └── ShareService.java              // 공유 리스트 반환
│
├── dto/
│   ├── ReservationDto.java
│   ├── PlaceDto.java
│   ├── ReviewDto.java
│   └── ShareDto.java
│
├── config/
│   └── OpenApiConfig.java             // Swagger 설정
│
└── BackendExtensionApplication.java   // Spring Boot main 진입점


🧰 사용 기술
구분	기술 스택
Framework	Spring Boot 3.5.7
Language	Java 17
Build Tool	Gradle
Dependencies	spring-boot-starter-web, JPA, Validation, Lombok, Springdoc OpenAPI
Database	(현재 H2 Memory Mode)
API 문서화	Swagger UI /v3/api-docs

🌐 Swagger UI

실행 후 접속:
👉 http://localhost:8080/swagger-ui/index.html

각 엔드포인트 예시:

/api/예약 → 예약 목록 반환
/api/공유 → 공유 데이터 반환
/api/장소 → 장소 정보 반환
/api/리뷰 → 리뷰 리스트 반환

⚙️ 실행 명령
# 빌드
.\gradlew.bat clean build

# 실행
.\gradlew.bat bootRun

✅ 특징 요약

- Spring Boot 표준 구조 + Swagger 문서 자동 생성
- API 호출 테스트용 Dummy 데이터 세팅 완료
- Controller → Service → DTO 3단 구조로 분리
- Gradle Wrapper로 환경독립적 빌드 가능
- GitHub에 push 완료:
🔗 https://github.com/baej5600-cpu/ackend-extension






