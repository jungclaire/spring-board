package spring.board.user;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class User {

  @Id
  @GeneratedValue
  private Long id;

  private ProviderType providerType;

  private String identifier;

  @Setter
  private String profileImageUrl;

  @Setter
  private String nickname;

  private String phoneNumber;

  // TODO: 친구관계 추가

  private LocalDateTime createdDateTime;

  private LocalDateTime updatedDateTime;

}
