
package acme.entities.challenges;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Challenge extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	private String				title;

	@NotBlank
	private String				description;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				creationDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date				deadline;

	@NotBlank
	private String				rookieGoal;

	@Valid
	private Money				rookieReward;

	@NotBlank
	private String				averageGoal;

	@Valid
	private Money				averageReward;

	@NotBlank
	private String				expertGoal;

	@Valid
	private Money				expertReward;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------

}
