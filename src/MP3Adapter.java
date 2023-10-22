class MP3Adapter implements MediaPlayer {
    private MP3Player mp3Player;

    MP3Adapter(MP3Player mp3Player) {
        this.mp3Player = mp3Player;
    }

    @Override
    public void play() {
        mp3Player.playMP3();
    }

    @Override
    public void pause() {
        mp3Player.pauseMP3();
    }

    @Override
    public void stop() {
        mp3Player.stopMP3();
    }
}