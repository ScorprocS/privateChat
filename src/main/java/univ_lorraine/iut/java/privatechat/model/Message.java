package univ_lorraine.iut.java.privatechat.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Message implements Serializable {

	// private static final long serialVersionUID = 1L;

	private User sender;
	private MessageType type;
	private String content;
	private LocalDateTime sendedDate;
	private LocalDateTime receptionDate;

	public Message(User sender, MessageType type, String content, LocalDateTime sendedDate,
			LocalDateTime receptionDate) {
		super();
		this.sender = sender;
		this.type = type;
		this.content = content;
		this.sendedDate = sendedDate;
		this.receptionDate = receptionDate;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public LocalDateTime getSendedDate() {
		return sendedDate;
	}

	public void setSendedDate(LocalDateTime sendedDate) {
		this.sendedDate = sendedDate;
	}

	public LocalDateTime getReceptionDate() {
		return receptionDate;
	}

	public void setReceptionDate(LocalDateTime receptionDate) {
		this.receptionDate = receptionDate;
	}

	@Override
	public String toString() {
		return "Message [sender=" + sender + ", type=" + type + ", content=" + content + ", sendedDate=" + sendedDate
				+ ", receptionDate=" + receptionDate + "]";
	}
}
