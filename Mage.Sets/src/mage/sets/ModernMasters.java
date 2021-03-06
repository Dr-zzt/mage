/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author LevelX2
 */
public class ModernMasters extends ExpansionSet {

    private static final ModernMasters instance = new ModernMasters();

    public static ModernMasters getInstance() {
        return instance;
    }

    private ModernMasters() {
        super("Modern Masters", "MMA", ExpansionSet.buildDate(2013, 6, 7), SetType.SUPPLEMENTAL);
        this.blockName = "Reprint";
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 0;
        this.numBoosterCommon = 11;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Absorb Vis", 71, Rarity.COMMON, mage.cards.a.AbsorbVis.class));
        cards.add(new SetCardInfo("Academy Ruins", 219, Rarity.RARE, mage.cards.a.AcademyRuins.class));
        cards.add(new SetCardInfo("Adarkar Valkyrie", 1, Rarity.RARE, mage.cards.a.AdarkarValkyrie.class));
        cards.add(new SetCardInfo("Aethersnipe", 36, Rarity.COMMON, mage.cards.a.Aethersnipe.class));
        cards.add(new SetCardInfo("Aether Spellbomb", 196, Rarity.COMMON, mage.cards.a.AetherSpellbomb.class));
        cards.add(new SetCardInfo("Aether Vial", 197, Rarity.RARE, mage.cards.a.AetherVial.class));
        cards.add(new SetCardInfo("Amrou Scout", 2, Rarity.COMMON, mage.cards.a.AmrouScout.class));
        cards.add(new SetCardInfo("Amrou Seekers", 3, Rarity.COMMON, mage.cards.a.AmrouSeekers.class));
        cards.add(new SetCardInfo("Angel's Grace", 4, Rarity.RARE, mage.cards.a.AngelsGrace.class));
        cards.add(new SetCardInfo("Arcbound Ravager", 198, Rarity.RARE, mage.cards.a.ArcboundRavager.class));
        cards.add(new SetCardInfo("Arcbound Stinger", 199, Rarity.COMMON, mage.cards.a.ArcboundStinger.class));
        cards.add(new SetCardInfo("Arcbound Wanderer", 200, Rarity.COMMON, mage.cards.a.ArcboundWanderer.class));
        cards.add(new SetCardInfo("Arcbound Worker", 201, Rarity.COMMON, mage.cards.a.ArcboundWorker.class));
        cards.add(new SetCardInfo("Auntie's Snitch", 72, Rarity.UNCOMMON, mage.cards.a.AuntiesSnitch.class));
        cards.add(new SetCardInfo("Auriok Salvagers", 5, Rarity.RARE, mage.cards.a.AuriokSalvagers.class));
        cards.add(new SetCardInfo("Avian Changeling", 6, Rarity.COMMON, mage.cards.a.AvianChangeling.class));
        cards.add(new SetCardInfo("Blightspeaker", 73, Rarity.COMMON, mage.cards.b.Blightspeaker.class));
        cards.add(new SetCardInfo("Blinding Beam", 7, Rarity.COMMON, mage.cards.b.BlindingBeam.class));
        cards.add(new SetCardInfo("Blind-Spot Giant", 105, Rarity.COMMON, mage.cards.b.BlindSpotGiant.class));
        cards.add(new SetCardInfo("Blinkmoth Nexus", 220, Rarity.RARE, mage.cards.b.BlinkmothNexus.class));
        cards.add(new SetCardInfo("Blood Moon", 106, Rarity.RARE, mage.cards.b.BloodMoon.class));
        cards.add(new SetCardInfo("Bonesplitter", 202, Rarity.COMMON, mage.cards.b.Bonesplitter.class));
        cards.add(new SetCardInfo("Bound in Silence", 8, Rarity.COMMON, mage.cards.b.BoundInSilence.class));
        cards.add(new SetCardInfo("Bridge from Below", 74, Rarity.RARE, mage.cards.b.BridgeFromBelow.class));
        cards.add(new SetCardInfo("Brute Force", 107, Rarity.COMMON, mage.cards.b.BruteForce.class));
        cards.add(new SetCardInfo("Careful Consideration", 37, Rarity.UNCOMMON, mage.cards.c.CarefulConsideration.class));
        cards.add(new SetCardInfo("Cenn's Enlistment", 9, Rarity.COMMON, mage.cards.c.CennsEnlistment.class));
        cards.add(new SetCardInfo("Chalice of the Void", 203, Rarity.RARE, mage.cards.c.ChaliceOfTheVoid.class));
        cards.add(new SetCardInfo("Citanul Woodreaders", 140, Rarity.COMMON, mage.cards.c.CitanulWoodreaders.class));
        cards.add(new SetCardInfo("City of Brass", 221, Rarity.RARE, mage.cards.c.CityOfBrass.class));
        cards.add(new SetCardInfo("Cloudgoat Ranger", 10, Rarity.UNCOMMON, mage.cards.c.CloudgoatRanger.class));
        cards.add(new SetCardInfo("Cold-Eyed Selkie", 186, Rarity.RARE, mage.cards.c.ColdEyedSelkie.class));
        cards.add(new SetCardInfo("Countryside Crusher", 108, Rarity.RARE, mage.cards.c.CountrysideCrusher.class));
        cards.add(new SetCardInfo("Court Homunculus", 11, Rarity.COMMON, mage.cards.c.CourtHomunculus.class));
        cards.add(new SetCardInfo("Crush Underfoot", 109, Rarity.COMMON, mage.cards.c.CrushUnderfoot.class));
        cards.add(new SetCardInfo("Cryptic Command", 38, Rarity.RARE, mage.cards.c.CrypticCommand.class));
        cards.add(new SetCardInfo("Dakmor Salvage", 222, Rarity.UNCOMMON, mage.cards.d.DakmorSalvage.class));
        cards.add(new SetCardInfo("Dampen Thought", 39, Rarity.COMMON, mage.cards.d.DampenThought.class));
        cards.add(new SetCardInfo("Dark Confidant", 75, Rarity.MYTHIC, mage.cards.d.DarkConfidant.class));
        cards.add(new SetCardInfo("Death Cloud", 76, Rarity.RARE, mage.cards.d.DeathCloud.class));
        cards.add(new SetCardInfo("Death Denied", 77, Rarity.COMMON, mage.cards.d.DeathDenied.class));
        cards.add(new SetCardInfo("Death Rattle", 78, Rarity.UNCOMMON, mage.cards.d.DeathRattle.class));
        cards.add(new SetCardInfo("Deepcavern Imp", 79, Rarity.COMMON, mage.cards.d.DeepcavernImp.class));
        cards.add(new SetCardInfo("Demigod of Revenge", 187, Rarity.RARE, mage.cards.d.DemigodOfRevenge.class));
        cards.add(new SetCardInfo("Desperate Ritual", 110, Rarity.UNCOMMON, mage.cards.d.DesperateRitual.class));
        cards.add(new SetCardInfo("Dispeller's Capsule", 12, Rarity.COMMON, mage.cards.d.DispellersCapsule.class));
        cards.add(new SetCardInfo("Divinity of Pride", 188, Rarity.RARE, mage.cards.d.DivinityOfPride.class));
        cards.add(new SetCardInfo("Doubling Season", 141, Rarity.RARE, mage.cards.d.DoublingSeason.class));
        cards.add(new SetCardInfo("Drag Down", 80, Rarity.COMMON, mage.cards.d.DragDown.class));
        cards.add(new SetCardInfo("Dragonstorm", 111, Rarity.RARE, mage.cards.d.Dragonstorm.class));
        cards.add(new SetCardInfo("Dreamspoiler Witches", 81, Rarity.COMMON, mage.cards.d.DreamspoilerWitches.class));
        cards.add(new SetCardInfo("Durkwood Baloth", 142, Rarity.COMMON, mage.cards.d.DurkwoodBaloth.class));
        cards.add(new SetCardInfo("Earwig Squad", 82, Rarity.RARE, mage.cards.e.EarwigSquad.class));
        cards.add(new SetCardInfo("Echoing Courage", 143, Rarity.COMMON, mage.cards.e.EchoingCourage.class));
        cards.add(new SetCardInfo("Echoing Truth", 40, Rarity.COMMON, mage.cards.e.EchoingTruth.class));
        cards.add(new SetCardInfo("Electrolyze", 175, Rarity.UNCOMMON, mage.cards.e.Electrolyze.class));
        cards.add(new SetCardInfo("Elspeth, Knight-Errant", 13, Rarity.MYTHIC, mage.cards.e.ElspethKnightErrant.class));
        cards.add(new SetCardInfo("Empty the Warrens", 112, Rarity.COMMON, mage.cards.e.EmptyTheWarrens.class));
        cards.add(new SetCardInfo("Engineered Explosives", 204, Rarity.RARE, mage.cards.e.EngineeredExplosives.class));
        cards.add(new SetCardInfo("Epochrasite", 205, Rarity.UNCOMMON, mage.cards.e.Epochrasite.class));
        cards.add(new SetCardInfo("Errant Ephemeron", 41, Rarity.COMMON, mage.cards.e.ErrantEphemeron.class));
        cards.add(new SetCardInfo("Erratic Mutation", 42, Rarity.COMMON, mage.cards.e.ErraticMutation.class));
        cards.add(new SetCardInfo("Esperzoa", 43, Rarity.UNCOMMON, mage.cards.e.Esperzoa.class));
        cards.add(new SetCardInfo("Etched Oracle", 206, Rarity.UNCOMMON, mage.cards.e.EtchedOracle.class));
        cards.add(new SetCardInfo("Eternal Witness", 144, Rarity.UNCOMMON, mage.cards.e.EternalWitness.class));
        cards.add(new SetCardInfo("Etherium Sculptor", 44, Rarity.COMMON, mage.cards.e.EtheriumSculptor.class));
        cards.add(new SetCardInfo("Ethersworn Canonist", 14, Rarity.RARE, mage.cards.e.EtherswornCanonist.class));
        cards.add(new SetCardInfo("Executioner's Capsule", 83, Rarity.UNCOMMON, mage.cards.e.ExecutionersCapsule.class));
        cards.add(new SetCardInfo("Extirpate", 84, Rarity.RARE, mage.cards.e.Extirpate.class));
        cards.add(new SetCardInfo("Facevaulter", 85, Rarity.COMMON, mage.cards.f.Facevaulter.class));
        cards.add(new SetCardInfo("Faerie Macabre", 86, Rarity.COMMON, mage.cards.f.FaerieMacabre.class));
        cards.add(new SetCardInfo("Faerie Mechanist", 45, Rarity.COMMON, mage.cards.f.FaerieMechanist.class));
        cards.add(new SetCardInfo("Festering Goblin", 87, Rarity.COMMON, mage.cards.f.FesteringGoblin.class));
        cards.add(new SetCardInfo("Feudkiller's Verdict", 15, Rarity.UNCOMMON, mage.cards.f.FeudkillersVerdict.class));
        cards.add(new SetCardInfo("Fiery Fall", 113, Rarity.COMMON, mage.cards.f.FieryFall.class));
        cards.add(new SetCardInfo("Figure of Destiny", 189, Rarity.RARE, mage.cards.f.FigureOfDestiny.class));
        cards.add(new SetCardInfo("Flickerwisp", 16, Rarity.UNCOMMON, mage.cards.f.Flickerwisp.class));
        cards.add(new SetCardInfo("Frogmite", 207, Rarity.COMMON, mage.cards.f.Frogmite.class));
        cards.add(new SetCardInfo("Fury Charm", 114, Rarity.COMMON, mage.cards.f.FuryCharm.class));
        cards.add(new SetCardInfo("Giant Dustwasp", 145, Rarity.COMMON, mage.cards.g.GiantDustwasp.class));
        cards.add(new SetCardInfo("Gifts Ungiven", 46, Rarity.RARE, mage.cards.g.GiftsUngiven.class));
        cards.add(new SetCardInfo("Glacial Ray", 115, Rarity.COMMON, mage.cards.g.GlacialRay.class));
        cards.add(new SetCardInfo("Gleam of Resistance", 17, Rarity.COMMON, mage.cards.g.GleamOfResistance.class));
        cards.add(new SetCardInfo("Glen Elendra Archmage", 47, Rarity.RARE, mage.cards.g.GlenElendraArchmage.class));
        cards.add(new SetCardInfo("Glimmervoid", 223, Rarity.RARE, mage.cards.g.Glimmervoid.class));
        cards.add(new SetCardInfo("Grand Arbiter Augustin IV", 176, Rarity.RARE, mage.cards.g.GrandArbiterAugustinIV.class));
        cards.add(new SetCardInfo("Grapeshot", 116, Rarity.COMMON, mage.cards.g.Grapeshot.class));
        cards.add(new SetCardInfo("Greater Gargadon", 117, Rarity.RARE, mage.cards.g.GreaterGargadon.class));
        cards.add(new SetCardInfo("Greater Mossdog", 146, Rarity.COMMON, mage.cards.g.GreaterMossdog.class));
        cards.add(new SetCardInfo("Grinning Ignus", 118, Rarity.UNCOMMON, mage.cards.g.GrinningIgnus.class));
        cards.add(new SetCardInfo("Hammerheim Deadeye", 119, Rarity.COMMON, mage.cards.h.HammerheimDeadeye.class));
        cards.add(new SetCardInfo("Hana Kami", 147, Rarity.COMMON, mage.cards.h.HanaKami.class));
        cards.add(new SetCardInfo("Hillcomber Giant", 18, Rarity.COMMON, mage.cards.h.HillcomberGiant.class));
        cards.add(new SetCardInfo("Horobi's Whisper", 88, Rarity.UNCOMMON, mage.cards.h.HorobisWhisper.class));
        cards.add(new SetCardInfo("Imperiosaur", 148, Rarity.COMMON, mage.cards.i.Imperiosaur.class));
        cards.add(new SetCardInfo("Incremental Growth", 149, Rarity.UNCOMMON, mage.cards.i.IncrementalGrowth.class));
        cards.add(new SetCardInfo("Ivory Giant", 19, Rarity.COMMON, mage.cards.i.IvoryGiant.class));
        cards.add(new SetCardInfo("Jhoira of the Ghitu", 177, Rarity.RARE, mage.cards.j.JhoiraOfTheGhitu.class));
        cards.add(new SetCardInfo("Jugan, the Rising Star", 150, Rarity.MYTHIC, mage.cards.j.JuganTheRisingStar.class));
        cards.add(new SetCardInfo("Kataki, War's Wage", 20, Rarity.RARE, mage.cards.k.KatakiWarsWage.class));
        cards.add(new SetCardInfo("Keiga, the Tide Star", 48, Rarity.MYTHIC, mage.cards.k.KeigaTheTideStar.class));
        cards.add(new SetCardInfo("Kiki-Jiki, Mirror Breaker", 120, Rarity.MYTHIC, mage.cards.k.KikiJikiMirrorBreaker.class));
        cards.add(new SetCardInfo("Kira, Great Glass-Spinner", 49, Rarity.RARE, mage.cards.k.KiraGreatGlassSpinner.class));
        cards.add(new SetCardInfo("Kitchen Finks", 190, Rarity.UNCOMMON, mage.cards.k.KitchenFinks.class));
        cards.add(new SetCardInfo("Kithkin Greatheart", 21, Rarity.COMMON, mage.cards.k.KithkinGreatheart.class));
        cards.add(new SetCardInfo("Knight of the Reliquary", 178, Rarity.RARE, mage.cards.k.KnightOfTheReliquary.class));
        cards.add(new SetCardInfo("Kodama's Reach", 151, Rarity.COMMON, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Kokusho, the Evening Star", 89, Rarity.MYTHIC, mage.cards.k.KokushoTheEveningStar.class));
        cards.add(new SetCardInfo("Krosan Grip", 152, Rarity.UNCOMMON, mage.cards.k.KrosanGrip.class));
        cards.add(new SetCardInfo("Latchkey Faerie", 50, Rarity.COMMON, mage.cards.l.LatchkeyFaerie.class));
        cards.add(new SetCardInfo("Lava Spike", 121, Rarity.COMMON, mage.cards.l.LavaSpike.class));
        cards.add(new SetCardInfo("Life from the Loam", 153, Rarity.RARE, mage.cards.l.LifeFromTheLoam.class));
        cards.add(new SetCardInfo("Lightning Helix", 179, Rarity.UNCOMMON, mage.cards.l.LightningHelix.class));
        cards.add(new SetCardInfo("Logic Knot", 51, Rarity.COMMON, mage.cards.l.LogicKnot.class));
        cards.add(new SetCardInfo("Lotus Bloom", 208, Rarity.RARE, mage.cards.l.LotusBloom.class));
        cards.add(new SetCardInfo("Mad Auntie", 90, Rarity.UNCOMMON, mage.cards.m.MadAuntie.class));
        cards.add(new SetCardInfo("Maelstrom Pulse", 180, Rarity.RARE, mage.cards.m.MaelstromPulse.class));
        cards.add(new SetCardInfo("Manamorphose", 191, Rarity.UNCOMMON, mage.cards.m.Manamorphose.class));
        cards.add(new SetCardInfo("Marsh Flitter", 91, Rarity.UNCOMMON, mage.cards.m.MarshFlitter.class));
        cards.add(new SetCardInfo("Masked Admirers", 154, Rarity.UNCOMMON, mage.cards.m.MaskedAdmirers.class));
        cards.add(new SetCardInfo("Meadowboon", 22, Rarity.UNCOMMON, mage.cards.m.Meadowboon.class));
        cards.add(new SetCardInfo("Meloku the Clouded Mirror", 52, Rarity.RARE, mage.cards.m.MelokuTheCloudedMirror.class));
        cards.add(new SetCardInfo("Mind Funeral", 181, Rarity.UNCOMMON, mage.cards.m.MindFuneral.class));
        cards.add(new SetCardInfo("Mogg War Marshal", 122, Rarity.COMMON, mage.cards.m.MoggWarMarshal.class));
        cards.add(new SetCardInfo("Moldervine Cloak", 155, Rarity.COMMON, mage.cards.m.MoldervineCloak.class));
        cards.add(new SetCardInfo("Molten Disaster", 123, Rarity.RARE, mage.cards.m.MoltenDisaster.class));
        cards.add(new SetCardInfo("Mothdust Changeling", 53, Rarity.COMMON, mage.cards.m.MothdustChangeling.class));
        cards.add(new SetCardInfo("Mulldrifter", 54, Rarity.UNCOMMON, mage.cards.m.Mulldrifter.class));
        cards.add(new SetCardInfo("Murderous Redcap", 192, Rarity.UNCOMMON, mage.cards.m.MurderousRedcap.class));
        cards.add(new SetCardInfo("Myr Enforcer", 209, Rarity.COMMON, mage.cards.m.MyrEnforcer.class));
        cards.add(new SetCardInfo("Myr Retriever", 210, Rarity.UNCOMMON, mage.cards.m.MyrRetriever.class));
        cards.add(new SetCardInfo("Nantuko Shaman", 156, Rarity.COMMON, mage.cards.n.NantukoShaman.class));
        cards.add(new SetCardInfo("Narcomoeba", 55, Rarity.UNCOMMON, mage.cards.n.Narcomoeba.class));
        cards.add(new SetCardInfo("Oona, Queen of the Fae", 193, Rarity.RARE, mage.cards.o.OonaQueenOfTheFae.class));
        cards.add(new SetCardInfo("Otherworldly Journey", 23, Rarity.COMMON, mage.cards.o.OtherworldlyJourney.class));
        cards.add(new SetCardInfo("Pact of Negation", 56, Rarity.RARE, mage.cards.p.PactOfNegation.class));
        cards.add(new SetCardInfo("Pallid Mycoderm", 24, Rarity.COMMON, mage.cards.p.PallidMycoderm.class));
        cards.add(new SetCardInfo("Paradise Mantle", 211, Rarity.UNCOMMON, mage.cards.p.ParadiseMantle.class));
        cards.add(new SetCardInfo("Pardic Dragon", 124, Rarity.UNCOMMON, mage.cards.p.PardicDragon.class));
        cards.add(new SetCardInfo("Path to Exile", 25, Rarity.UNCOMMON, mage.cards.p.PathToExile.class));
        cards.add(new SetCardInfo("Peer Through Depths", 57, Rarity.COMMON, mage.cards.p.PeerThroughDepths.class));
        cards.add(new SetCardInfo("Penumbra Spider", 157, Rarity.COMMON, mage.cards.p.PenumbraSpider.class));
        cards.add(new SetCardInfo("Peppersmoke", 92, Rarity.COMMON, mage.cards.p.Peppersmoke.class));
        cards.add(new SetCardInfo("Perilous Research", 58, Rarity.COMMON, mage.cards.p.PerilousResearch.class));
        cards.add(new SetCardInfo("Pestermite", 59, Rarity.COMMON, mage.cards.p.Pestermite.class));
        cards.add(new SetCardInfo("Petals of Insight", 60, Rarity.COMMON, mage.cards.p.PetalsOfInsight.class));
        cards.add(new SetCardInfo("Phthisis", 93, Rarity.UNCOMMON, mage.cards.p.Phthisis.class));
        cards.add(new SetCardInfo("Plumeveil", 194, Rarity.UNCOMMON, mage.cards.p.Plumeveil.class));
        cards.add(new SetCardInfo("Progenitus", 182, Rarity.MYTHIC, mage.cards.p.Progenitus.class));
        cards.add(new SetCardInfo("Pyrite Spellbomb", 212, Rarity.COMMON, mage.cards.p.PyriteSpellbomb.class));
        cards.add(new SetCardInfo("Pyromancer's Swath", 125, Rarity.RARE, mage.cards.p.PyromancersSwath.class));
        cards.add(new SetCardInfo("Rathi Trapper", 94, Rarity.COMMON, mage.cards.r.RathiTrapper.class));
        cards.add(new SetCardInfo("Raven's Crime", 95, Rarity.COMMON, mage.cards.r.RavensCrime.class));
        cards.add(new SetCardInfo("Reach of Branches", 158, Rarity.UNCOMMON, mage.cards.r.ReachOfBranches.class));
        cards.add(new SetCardInfo("Reach Through Mists", 61, Rarity.COMMON, mage.cards.r.ReachThroughMists.class));
        cards.add(new SetCardInfo("Relic of Progenitus", 213, Rarity.UNCOMMON, mage.cards.r.RelicOfProgenitus.class));
        cards.add(new SetCardInfo("Reveillark", 26, Rarity.RARE, mage.cards.r.Reveillark.class));
        cards.add(new SetCardInfo("Rift Bolt", 126, Rarity.COMMON, mage.cards.r.RiftBolt.class));
        cards.add(new SetCardInfo("Rift Elemental", 127, Rarity.COMMON, mage.cards.r.RiftElemental.class));
        cards.add(new SetCardInfo("Riftsweeper", 159, Rarity.UNCOMMON, mage.cards.r.Riftsweeper.class));
        cards.add(new SetCardInfo("Riftwing Cloudskate", 62, Rarity.UNCOMMON, mage.cards.r.RiftwingCloudskate.class));
        cards.add(new SetCardInfo("Rude Awakening", 160, Rarity.RARE, mage.cards.r.RudeAwakening.class));
        cards.add(new SetCardInfo("Runed Stalactite", 214, Rarity.COMMON, mage.cards.r.RunedStalactite.class));
        cards.add(new SetCardInfo("Ryusei, the Falling Star", 128, Rarity.MYTHIC, mage.cards.r.RyuseiTheFallingStar.class));
        cards.add(new SetCardInfo("Saltfield Recluse", 27, Rarity.COMMON, mage.cards.s.SaltfieldRecluse.class));
        cards.add(new SetCardInfo("Sanctum Gargoyle", 28, Rarity.COMMON, mage.cards.s.SanctumGargoyle.class));
        cards.add(new SetCardInfo("Sandsower", 29, Rarity.UNCOMMON, mage.cards.s.Sandsower.class));
        cards.add(new SetCardInfo("Sarkhan Vol", 183, Rarity.MYTHIC, mage.cards.s.SarkhanVol.class));
        cards.add(new SetCardInfo("Scion of Oona", 63, Rarity.RARE, mage.cards.s.ScionOfOona.class));
        cards.add(new SetCardInfo("Search for Tomorrow", 161, Rarity.COMMON, mage.cards.s.SearchForTomorrow.class));
        cards.add(new SetCardInfo("Shrapnel Blast", 129, Rarity.UNCOMMON, mage.cards.s.ShrapnelBlast.class));
        cards.add(new SetCardInfo("Skeletal Vampire", 96, Rarity.RARE, mage.cards.s.SkeletalVampire.class));
        cards.add(new SetCardInfo("Skyreach Manta", 215, Rarity.COMMON, mage.cards.s.SkyreachManta.class));
        cards.add(new SetCardInfo("Slaughter Pact", 97, Rarity.RARE, mage.cards.s.SlaughterPact.class));
        cards.add(new SetCardInfo("Spell Snare", 64, Rarity.UNCOMMON, mage.cards.s.SpellSnare.class));
        cards.add(new SetCardInfo("Spellstutter Sprite", 65, Rarity.COMMON, mage.cards.s.SpellstutterSprite.class));
        cards.add(new SetCardInfo("Sporesower Thallid", 162, Rarity.UNCOMMON, mage.cards.s.SporesowerThallid.class));
        cards.add(new SetCardInfo("Sporoloth Ancient", 163, Rarity.COMMON, mage.cards.s.SporolothAncient.class));
        cards.add(new SetCardInfo("Squee, Goblin Nabob", 130, Rarity.RARE, mage.cards.s.SqueeGoblinNabob.class));
        cards.add(new SetCardInfo("Stingscourger", 131, Rarity.COMMON, mage.cards.s.Stingscourger.class));
        cards.add(new SetCardInfo("Stinkdrinker Daredevil", 132, Rarity.COMMON, mage.cards.s.StinkdrinkerDaredevil.class));
        cards.add(new SetCardInfo("Stinkweed Imp", 98, Rarity.COMMON, mage.cards.s.StinkweedImp.class));
        cards.add(new SetCardInfo("Stir the Pride", 30, Rarity.UNCOMMON, mage.cards.s.StirThePride.class));
        cards.add(new SetCardInfo("Stonehewer Giant", 31, Rarity.RARE, mage.cards.s.StonehewerGiant.class));
        cards.add(new SetCardInfo("Street Wraith", 99, Rarity.COMMON, mage.cards.s.StreetWraith.class));
        cards.add(new SetCardInfo("Sudden Shock", 133, Rarity.UNCOMMON, mage.cards.s.SuddenShock.class));
        cards.add(new SetCardInfo("Summoner's Pact", 164, Rarity.RARE, mage.cards.s.SummonersPact.class));
        cards.add(new SetCardInfo("Sword of Fire and Ice", 216, Rarity.MYTHIC, mage.cards.s.SwordOfFireAndIce.class));
        cards.add(new SetCardInfo("Sword of Light and Shadow", 217, Rarity.MYTHIC, mage.cards.s.SwordOfLightAndShadow.class));
        cards.add(new SetCardInfo("Sylvan Bounty", 165, Rarity.COMMON, mage.cards.s.SylvanBounty.class));
        cards.add(new SetCardInfo("Syphon Life", 100, Rarity.COMMON, mage.cards.s.SyphonLife.class));
        cards.add(new SetCardInfo("Take Possession", 66, Rarity.UNCOMMON, mage.cards.t.TakePossession.class));
        cards.add(new SetCardInfo("Tarmogoyf", 166, Rarity.MYTHIC, mage.cards.t.Tarmogoyf.class));
        cards.add(new SetCardInfo("Tar Pitcher", 134, Rarity.UNCOMMON, mage.cards.t.TarPitcher.class));
        cards.add(new SetCardInfo("Terashi's Grasp", 32, Rarity.UNCOMMON, mage.cards.t.TerashisGrasp.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 224, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Test of Faith", 33, Rarity.COMMON, mage.cards.t.TestOfFaith.class));
        cards.add(new SetCardInfo("Thallid", 167, Rarity.COMMON, mage.cards.t.Thallid.class));
        cards.add(new SetCardInfo("Thallid Germinator", 168, Rarity.COMMON, mage.cards.t.ThallidGerminator.class));
        cards.add(new SetCardInfo("Thallid Shell-Dweller", 169, Rarity.COMMON, mage.cards.t.ThallidShellDweller.class));
        cards.add(new SetCardInfo("Thieving Sprite", 101, Rarity.COMMON, mage.cards.t.ThievingSprite.class));
        cards.add(new SetCardInfo("Thirst for Knowledge", 67, Rarity.UNCOMMON, mage.cards.t.ThirstForKnowledge.class));
        cards.add(new SetCardInfo("Thundercloud Shaman", 135, Rarity.UNCOMMON, mage.cards.t.ThundercloudShaman.class));
        cards.add(new SetCardInfo("Thundering Giant", 136, Rarity.COMMON, mage.cards.t.ThunderingGiant.class));
        cards.add(new SetCardInfo("Tidehollow Sculler", 184, Rarity.UNCOMMON, mage.cards.t.TidehollowSculler.class));
        cards.add(new SetCardInfo("Tombstalker", 102, Rarity.RARE, mage.cards.t.Tombstalker.class));
        cards.add(new SetCardInfo("Tooth and Nail", 170, Rarity.RARE, mage.cards.t.ToothAndNail.class));
        cards.add(new SetCardInfo("Torrent of Stone", 137, Rarity.COMMON, mage.cards.t.TorrentOfStone.class));
        cards.add(new SetCardInfo("Traumatic Visions", 68, Rarity.COMMON, mage.cards.t.TraumaticVisions.class));
        cards.add(new SetCardInfo("Tribal Flames", 138, Rarity.UNCOMMON, mage.cards.t.TribalFlames.class));
        cards.add(new SetCardInfo("Tromp the Domains", 171, Rarity.UNCOMMON, mage.cards.t.TrompTheDomains.class));
        cards.add(new SetCardInfo("Trygon Predator", 185, Rarity.UNCOMMON, mage.cards.t.TrygonPredator.class));
        cards.add(new SetCardInfo("Vedalken Dismisser", 69, Rarity.COMMON, mage.cards.v.VedalkenDismisser.class));
        cards.add(new SetCardInfo("Vedalken Shackles", 218, Rarity.MYTHIC, mage.cards.v.VedalkenShackles.class));
        cards.add(new SetCardInfo("Vendilion Clique", 70, Rarity.MYTHIC, mage.cards.v.VendilionClique.class));
        cards.add(new SetCardInfo("Verdeloth the Ancient", 172, Rarity.RARE, mage.cards.v.VerdelothTheAncient.class));
        cards.add(new SetCardInfo("Veteran Armorer", 34, Rarity.COMMON, mage.cards.v.VeteranArmorer.class));
        cards.add(new SetCardInfo("Vivid Crag", 225, Rarity.UNCOMMON, mage.cards.v.VividCrag.class));
        cards.add(new SetCardInfo("Vivid Creek", 226, Rarity.UNCOMMON, mage.cards.v.VividCreek.class));
        cards.add(new SetCardInfo("Vivid Grove", 227, Rarity.UNCOMMON, mage.cards.v.VividGrove.class));
        cards.add(new SetCardInfo("Vivid Marsh", 228, Rarity.UNCOMMON, mage.cards.v.VividMarsh.class));
        cards.add(new SetCardInfo("Vivid Meadow", 229, Rarity.UNCOMMON, mage.cards.v.VividMeadow.class));
        cards.add(new SetCardInfo("Walker of the Grove", 173, Rarity.COMMON, mage.cards.w.WalkerOfTheGrove.class));
        cards.add(new SetCardInfo("Warren Pilferers", 103, Rarity.COMMON, mage.cards.w.WarrenPilferers.class));
        cards.add(new SetCardInfo("Warren Weirding", 104, Rarity.COMMON, mage.cards.w.WarrenWeirding.class));
        cards.add(new SetCardInfo("War-Spike Changeling", 139, Rarity.COMMON, mage.cards.w.WarSpikeChangeling.class));
        cards.add(new SetCardInfo("Woodfall Primus", 174, Rarity.RARE, mage.cards.w.WoodfallPrimus.class));
        cards.add(new SetCardInfo("Worm Harvest", 195, Rarity.UNCOMMON, mage.cards.w.WormHarvest.class));
        cards.add(new SetCardInfo("Yosei, the Morning Star", 35, Rarity.MYTHIC, mage.cards.y.YoseiTheMorningStar.class));
    }

}
