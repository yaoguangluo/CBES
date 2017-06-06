package iluwatar.handler;

import iluwatar.event.UserCreatedEvent;
import iluwatar.Handler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Handles the {@link UserCreatedEvent} message.
 */
public class UserCreatedEventHandler implements Handler<UserCreatedEvent> {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserCreatedEventHandler.class);

  @Override
  public void onEvent(UserCreatedEvent event) {
    LOGGER.info("User '{}' has been Created!", event.getUser().getUsername());
  }

}