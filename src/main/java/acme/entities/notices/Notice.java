
package acme.entities.notices;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Notice extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	@URL
	private String				header;

	@NotBlank
	private String				title;

	private String				links;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				creationDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				deadline;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
