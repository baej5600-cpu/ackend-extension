# ⚙️ Backend Extension

> Spring Boot 기반 백엔드 확장 프로젝트 (backend-extension)

---

## 🏗️ Project Overview

이 프로젝트는 기존 백엔드 시스템의 기능을 확장하기 위한 **Spring Boot 기반 모듈**입니다.  
Clova OCR, 음성 인식(STT/TTS), AI 분석, 외부 API 연동 등의 기능을 통합하고 확장 가능하게 설계되었습니다.

---

## 🧩 Tech Stack

| Category | Details |
|-----------|----------|
| **Language** | Java 17 / 21 |
| **Framework** | Spring Boot 3.x (Gradle 기반) |
| **Build Tool** | Gradle Wrapper (`gradlew`, `gradlew.bat`) |
| **Dependencies** | Spring Web, Lombok, Jackson, Springdoc(OpenAPI) |
| **Packaging** | `.jar` / `.war` (depending on deployment) |

---

## 📂 Project Structure
backend-extension/
├── gradle/
│ └── wrapper/ # Gradle wrapper 설정
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/example/backendextension/
│ │ │ ├── controller/ # REST API Controller
│ │ │ ├── service/ # Service layer
│ │ │ ├── dto/ # Data Transfer Objects
│ │ │ ├── config/ # 설정 (CORS, Bean 등)
│ │ │ └── BackendExtensionApplication.java
│ │ └── resources/
│ │ ├── application.yml # 환경 설정 파일
│ │ └── static/ # 정적 리소스 (필요시)
│ └── test/ # 테스트 코드
├── build.gradle
├── settings.gradle
├── .gitignore
└── README.md


---

## 🚀 Getting Started

1️⃣ Clone Repository
```bash
git clone https://github.com/baej5600-cpu/backend-extension.git
cd backend-extension

2️⃣ Build Project
./gradlew clean build

3️⃣ Run Application
./gradlew bootRun
Default port: 8080
Swagger UI (if enabled): http://localhost:8080/swagger-ui/index.html

🧠 Example Feature Ideas

CLOVA OCR 연동 모듈 (ClovaOcrService)

음성 예약 STT/TTS 처리기 (SpeechService)

AI 노쇼 분석 엔진 (NoShowPredictionService)

공통 API 게이트웨이 연동 (ApiGatewayConfig)


🧑‍💻 Author

Bae Junho
📧 baej5600cpu@gmail.com

🌐 GitHub Profile








