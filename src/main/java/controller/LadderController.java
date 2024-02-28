package controller;

import model.ladder.Height;
import model.ladder.Ladder;
import model.ladder.LadderGenerateStrategy;
import model.participant.Participants;
import view.InputView;
import view.OutputView;

import java.io.IOException;

public class LadderController {

    private final InputView inputView;
    private final OutputView outputView;

    public LadderController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void play() throws IOException {
        Participants participants = new Participants(inputView.inputParticipantsName());
        Height height = new Height(inputView.inputLadderHeight());
        Ladder ladder = new Ladder(new LadderGenerateStrategy(), height, participants);
        outputView.printResult(height, participants, ladder);
    }
}
