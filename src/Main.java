import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MP3Player mp3Player = new MP3Player();
        WAVPlayer wavPlayer = new WAVPlayer();


        MediaPlayer mp3Adapter = new MP3Adapter(mp3Player);
        MediaPlayer wavAdapter = new WAVAdapter(wavPlayer);


        Scanner scanner = new Scanner(System.in);
        String input;


        while (true) {
            input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("stop")) {
                System.out.println("Stopping playback.");
                break;
            }

            if (input.endsWith(".mp3")) {
                mp3Adapter.play();
            } else if (input.endsWith(".wav")) {
                wavAdapter.play();
            } else {
                System.out.println("Unsupported media format. Please provide a valid media file or 'stop' to exit.");
            }
        }

        scanner.close();
    }
}
