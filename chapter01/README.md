# Chapter 01
## BlockingIOExample.java
### serve() / processRequest()
1. 서버 소켓을 열어 listen 상태로 둔다.
2. 클라이언트 소켓을 listen 상태의 서버 소켓에 연결한다.
3. I/O 스트림을 구성한다.
4. "Done" 이라는 문자열을 받을 때까지 스트림을 문장 단위로 읽어들이며, 읽기 성공 시 "Processed"를 반환한다..
## ConnectExample
## ConnectHandler