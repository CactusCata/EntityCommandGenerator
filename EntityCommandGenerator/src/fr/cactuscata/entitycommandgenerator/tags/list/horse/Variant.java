package fr.cactuscata.entitycommandgenerator.tags.list.horse;

import fr.cactuscata.entitycommandgenerator.tags.list.IntTag;

public class Variant extends IntTag {
	
	public Variant(int variantValue) {
		super(variantValue, 0,  1030);
	}
	
	public Variant(ColorVariant colorVariant, MarkingVariant markingMariant) {
		this(colorVariant.getVariantValue() + markingMariant.getVariantValue());
	}
	
	private interface IVariantValue {
		public int getVariantValue();
	}
	
	public static enum ColorVariant implements IVariantValue {
		
		WHITE(0),
		CREAMY(1),
		CHESTNUT(2),
		BROWN(3),
		BLACK(4),
		GREY(5),
		DARK_BROWN(6);

		private final int colorVariantvalue;
		
		private ColorVariant(int colorVariantValue) {
			this.colorVariantvalue = colorVariantValue;
		}
		
		@Override
		public int getVariantValue() {
			return this.colorVariantvalue;
		}
		
	}
	
	public static enum MarkingVariant implements IVariantValue {
		
		NONE(0),
		WHITE(256),
		WHITE_FIELD(512),
		WHITE_DOTS(768),
		BLACK_DOTS(1024);

		private final int colorVariantvalue;
		
		private MarkingVariant(int colorVariantValue) {
			this.colorVariantvalue = colorVariantValue;
		}
		
		@Override
		public int getVariantValue() {
			return this.colorVariantvalue;
		}
		
	}
	
}
