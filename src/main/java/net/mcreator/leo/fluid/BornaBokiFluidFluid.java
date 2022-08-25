
package net.mcreator.leo.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fluids.FluidAttributes;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.leo.init.LeoModItems;
import net.mcreator.leo.init.LeoModFluids;
import net.mcreator.leo.init.LeoModBlocks;

public abstract class BornaBokiFluidFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(LeoModFluids.BORNA_BOKI_FLUID,
			LeoModFluids.FLOWING_BORNA_BOKI_FLUID,
			FluidAttributes.builder(new ResourceLocation("leo:blocks/capture"), new ResourceLocation("leo:blocks/capture"))

					.rarity(Rarity.EPIC))
			.explosionResistance(100f)

			.tickRate(99)

			.bucket(LeoModItems.BORNA_BOKI_FLUID_BUCKET).block(() -> (LiquidBlock) LeoModBlocks.BORNA_BOKI_FLUID.get());

	private BornaBokiFluidFluid() {
		super(PROPERTIES);
	}

	@Override
	public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
		return super.getFlow(world, pos, fluidstate).scale(25);
	}

	public static class Source extends BornaBokiFluidFluid {
		public Source() {
			super();
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends BornaBokiFluidFluid {
		public Flowing() {
			super();
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
