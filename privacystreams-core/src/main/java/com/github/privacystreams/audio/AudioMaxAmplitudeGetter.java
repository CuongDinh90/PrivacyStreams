package com.github.privacystreams.audio;

import com.github.privacystreams.core.UQI;

/**
 * Calculate the max amplitude of an audio field.
 */

class AudioMaxAmplitudeGetter extends AudioProcessor<Integer> {

    AudioMaxAmplitudeGetter(String audioField) {
        super(audioField);
    }

    @Override
    protected Integer processAudio(UQI uqi, AudioData audioData) {
        return audioData.getMaxAmplitude(uqi);
    }

}
