public class Facade {

    public VideoFile convert(VideoFile file, Codec destinationCodec) {

        System.out.println("\n======= VideoConversionFacade: conversion started. =======");

        Codec sourceCodec = CodecFactory.extract(file);

        Buffer buffer = BitrateReader.read(file, sourceCodec);
        VideoFile newVideoFile = BitrateReader.convert(buffer, file.getName(), destinationCodec);
        AudioMixer audioMixer = new AudioMixer();
        audioMixer.fix(newVideoFile, file.getAudioBuffer());

        System.out.println("====== VideoConversionFacade: conversion completed =======\n");
        return newVideoFile;

    }

}
