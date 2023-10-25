package net.apex.infiniumevo.entity;

import net.apex.infiniumevo.InfiniumEvo;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, InfiniumEvo.MOD_ID);
    public static final RegistryObject<EntityType<ReaperScytheEntity>> REAPER_SCYTHE = register("projectile_reaper_scythe",
            EntityType.Builder.<ReaperScytheEntity>of(ReaperScytheEntity::new, MobCategory.MISC).setCustomClientFactory(ReaperScytheEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
    public static final RegistryObject<EntityType<ReaperEntity>> REAPER = register("reaper",
            EntityType.Builder.<ReaperEntity>of(ReaperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ReaperEntity::new).fireImmune().sized(0.6f, 1.8f));
    private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
        return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
    }

    @SubscribeEvent
    public static void init(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ReaperEntity.init();
        });
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(REAPER.get(), ReaperEntity.createAttributes().build());
    }


    public static void register(IEventBus eventBus) {
        REGISTRY.register(eventBus);
    }

}
