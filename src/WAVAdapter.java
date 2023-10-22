class WAVAdapter implements MediaPlayer {
    private WAVPlayer wavPlayer;

    WAVAdapter(WAVPlayer wavPlayer) {
        this.wavPlayer = wavPlayer;
    }

    @Override
    public void play() {
        wavPlayer.playWAV();
    }

    @Override
    public void pause() {
        wavPlayer.pauseWAV();
    }

    @Override
    public void stop() {
        wavPlayer.stopWAV();
    }
}
