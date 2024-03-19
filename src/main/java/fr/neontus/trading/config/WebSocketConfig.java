package fr.neontus.trading.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import fr.neontus.trading.common.network.WebSocketHandler;

@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
  @Override
  public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
      registry.addHandler(tradeWebSocketHandler(), "/stocks").setAllowedOrigins("*");
  }

  @Bean
  public WebSocketHandler tradeWebSocketHandler() {
      return new WebSocketHandler();
  }
}