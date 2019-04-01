package fr.cactuscata.entitycommandgenerator.tags.list.ozelot;

import fr.cactuscata.entitycommandgenerator.tags.list.IntTag;

public class CatType extends IntTag {

	public CatType(int catType) {
		super(catType, 0, 3);
	}

	public CatType(CatTypeEnum catTypeEnum) {
		this(catTypeEnum.getValue());
	}

	public static enum CatTypeEnum {
		WILD(0),
		TUXEDO(1),
		TABBY(2),
		SIAMESE(3);

		private final int catTypeValue;

		private CatTypeEnum(int catTypeValue) {
			this.catTypeValue = catTypeValue;
		}

		private int getValue() {
			return this.catTypeValue;
		}

	}

}
