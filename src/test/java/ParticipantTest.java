import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ParticipantTest {

    @DisplayName("참여자의 이름은 최대 5글자까지 부여할 수 있다.")
    @Test
    void participantNameThrowExceptionTest() {
        Assertions.assertThatThrownBy(() -> new Participant("asdfsda"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("참여자의 이름은 최대 5글자입니다.");
    }

    @DisplayName("참여자의 이름이 5글자 이하일 시 생성에 성공한다.")
    @Test
    void participantNameTest() {
        Assertions.assertThatCode(() -> new Participant("pobi"))
                .doesNotThrowAnyException();
    }

}
