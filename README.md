# 🧠 CLOVA OCR + Speech API Backend

> **Spring Boot 기반 OCR / STT 통합 백엔드 프로젝트**  
> CLOVA API를 활용해 이미지 → 텍스트(OCR) 및 음성 → 텍스트(Speech) 기능을 구현한 초기 테스트 버전입니다.  
> 프로젝트 전체가 Gradle 기반으로 구성되어 있으며 Swagger를 통해 API를 직접 테스트할 수 있습니다.

---

## 🚀 프로젝트 개요

| 항목 | 내용 |
|------|------|
| **프로젝트명** | clova-ocr-backend |
| **목적** | CLOVA API(🧾 OCR + 🎙 Speech to Text)를 Spring Boot 서버에 연동하여 텍스트 인식 기능 검증 |
| **주요 기능** | 이미지에서 텍스트 추출, 음성 파일에서 텍스트 변환 |
| **진행 상태** | OCR ✅ 정상 동작 / Speech ⚠ 500 오류 (CLOVA 응답 문제) |

---

## ⚙️ 개발 환경

| 항목 | 내용 |
|------|------|
| OS | Windows 10 / WSL2 (Ubuntu) |
| Backend | Spring Boot 3.5.0 |
| Language | Java 17 |
| IDE / Tool | VS Code |
| Build Tool | Gradle |
| Docs / Test | Swagger UI (springdoc-openapi 2.6.0) |
| API Provider | Naver Cloud Platform (CLOVA OCR / CLOVA Speech) |

---

## 📂 폴더 구조
<img width="641" height="492" alt="image" src="https://github.com/user-attachments/assets/0d58fd53-5bae-4010-a358-d4ba285fbdae" />




---

## 🧾 CLOVA OCR (이미지 → 텍스트)

- **API URL**
- https://tdl292xcpf.apigw.ntruss.com/custom/v1/.../general

X-OCR-SECRET: <Secret Key>
X-NCP-APIGW-API-KEY-ID: <API Key>

- **Controller**: `ClovaOcrController.java`  
- **Service**: `ClovaOcrService.java`  
- **Swagger 테스트 결과**: ✅ 정상 응답 (이미지 업로드 → 텍스트 추출 성공)

---

## 🎙 CLOVA Speech (음성 → 텍스트, STT)

- **API URL (최신 버전)**  
https://1q9fva0rvi.apigw.ntruss.com/speech/v1/recognize

- **Headers**
X-CLOVASPEECH-API-KEY: <API Key>

- **Controller**: `SpeechController.java`  
- **Service**: `SpeechService.java`  
- **결과:** ⚠ 500 Internal Server Error 발생 (서버 통신 및 인증 정상, 응답 포맷 추후 확인 필요)

---

## 🎧 음성 파일 전처리 (FFmpeg)

CLOVA Speech API는 반드시 `mono 16kHz PCM_s16le` 포맷을 요구합니다.

변환 명령어 (Windows PowerShell 기준):

```bash
C:\ffmpeg\ffmpeg-8.0-essentials_build\bin\ffmpeg.exe \
-i "음성테스트 1.wav" \
-ac 1 -ar 16000 -acodec pcm_s16le \
"output.wav"

✅ 변환 후 output.wav 생성 완료

포맷: mono / 16000Hz / PCM_s16le

🌐 Swagger 테스트 URL
기능	요청 경로	설명
Swagger UI	http://localhost:8081/swagger-ui.html
	API 테스트 페이지
OCR API	POST /api/ocr/upload	이미지 파일 업로드 후 텍스트 반환
Speech API	POST /api/speech/stt	음성 파일 업로드 후 텍스트 반환

📊 현재 상태 요약
항목	상태	비고
OCR API	✅ 정상 동작	텍스트 인식 성공
STT API	⚠ 500 오류	CLOVA 응답 문제 (파일·요청 포맷은 정상)
FFmpeg 변환	✅ 완료	16kHz mono 변환 성공
Swagger UI	✅ 완료	테스트 정상 작동
GitHub 업로드	✅ 완료	Private Repo 생성 완료

🔮 다음 단계 (백엔드 기능 확장 계획)
기능	설명
🗓 예약하기	사용자 예약 등록 및 조회 API
🔍 검색/지도	Kakao 또는 Naver Map API 연동
📤 공유하기	게시판 콘텐츠 공유 기능
💬 게시판	사용자 리뷰 CRUD 구현
💻 프론트 연동	React 또는 JSP/Servlet 기반 연결 예정




