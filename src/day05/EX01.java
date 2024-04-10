package day05;

public class EX01 {
    /*
    * 블루투스(스피커) 마이크
    *
    * 인터페이스 or 추상클래스
    *   -> 블루투스 스피커 : BGM(음악)
    *   -> 마이크 : 노래르 부를 수 있음
    * class BluetoothMic
    *   -> 음악도 나오고,
    *   -> 노래도 부를 수 있고
    * */
    public static void main(String[] args) {
        BluetoothMic bluetoothMic = new BluetoothMic();
        bluetoothMic.playBGM();
        bluetoothMic.amplifyVoice();
    }
}

interface Speaker{
    void playBGM();
}

interface Mic{
    void amplifyVoice();
}

class BluetoothMic implements Speaker, Mic{
    @Override
    public void playBGM(){
        System.out.println("BGM 재생중입니다.");
    }

    @Override
    public void amplifyVoice(){
        System.out.println("노래를 부르는 중입니다.");
    }
}

