package com.mckimquyen.atomicPeriodicTable.model

import androidx.annotation.Keep
import com.mckimquyen.atomicPeriodicTable.R

@Keep
object EquationModel {
    fun getList(equation: ArrayList<Equation>) {
        equation.add(Equation("Density", "General", R.drawable.e_density, "p: Density \nm: Mass \nV: Volume"))
        equation.add(
            Equation(
                "Power/ Effect",
                "General",
                R.drawable.e_powereffect,
                "P: Power/ Effect \nE: Energy \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Intensity",
                "General",
                R.drawable.e_intensity,
                "I: Intensity \nP: Power/ Effect \nA: Area"
            )
        )
        equation.add(
            Equation(
                "Efficiency",
                "General",
                R.drawable.e_efficiency,
                "n: Energy conversion efficiency \nE(in): Energy (in) \nE(out): Energy (out) \n" + "P(in): Power (in) \n" + "P(out): Power (out)"
            )
        )
        equation.add(Equation("Frequency", "General", R.drawable.e_frequency, "f: Frequency \nT: Period"))
        equation.add(
            Equation(
                "Angular Velocity",
                "General",
                R.drawable.e_angularvelocity,
                "w: Angular Velocity \nf: Frequency \nT: Period"
            )
        )
        equation.add(
            Equation(
                "Average Velocity",
                "Mechanics",
                R.drawable.e_averagevelocity,
                "v(average): Average Velocity \ns: End Position \ns(0): Start Position \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Linear Motion",
                "Mechanics",
                R.drawable.e_linearmotion,
                "s: Position Change \nv: Velocity \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Average Acceleration",
                "Mechanics",
                R.drawable.e_averageacceleration,
                "a(average): Average Acceleration \nv: End Velocity \nv(0): Start Velocity \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Instantaneous Velocity #1",
                "Mechanics",
                R.drawable.e_instantvelocity_1,
                "v: End Velocity \nv(0): Start Velocity \na: Acceleration \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Instantaneous Velocity #2",
                "Mechanics",
                R.drawable.e_instantvelocity_2,
                "s: Position Change \nv(0): Start Velocity \na: Acceleration \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Instantaneous Velocity #3",
                "Mechanics",
                R.drawable.e_instantvelocity_3,
                "v: End Velocity \nv(0): Start Velocity \na: Acceleration \ns: Position Change"
            )
        )
        equation.add(
            Equation(
                "Instantaneous Velocity #4",
                "Mechanics",
                R.drawable.e_instantvelocity_4,
                "v(average): Average Velocity \nv(0): Start Velocity \nv: End Acceleration"
            )
        )
        equation.add(
            Equation(
                "Newtown’s Second Law (Force Law)",
                "Mechanics",
                R.drawable.e_forcelaw,
                "F: Force \nm: Mass \na: Acceleration"
            )
        )
        equation.add(
            Equation(
                "Friction",
                "Mechanics",
                R.drawable.e_friction,
                "F(friction): Friction Force \nF(N): Normal Force \nu: Friction Coefficient"
            )
        )
        equation.add(
            Equation(
                "Hookes Law",
                "Mechanics",
                R.drawable.e_hookeslaw,
                "F(spring): Spring Force \nk: Spring Coefficient \ndelta l: Spring Extension"
            )
        )
        equation.add(
            Equation(
                "Law of Gravity",
                "Mechanics",
                R.drawable.e_lawofgravity,
                "F(g): Gravitational Force \nG: Gravitation Coefficient \nm: Mass \nr: Radius"
            )
        )
        equation.add(Equation("Force Moment", "Mechanics", R.drawable.e_moment, "M: Force Moment \nF: Force \nt: Time"))
        equation.add(Equation("Impulse", "Mechanics", R.drawable.e_impulse, "I: Impulse \nF: Force \nt: Time"))
        equation.add(
            Equation(
                "Law of Impulse",
                "Mechanics",
                R.drawable.e_lawofimpulse,
                "F: Force \nt: Time \nn: Mass \nv: End Velocity \nv(0) Start Velocity"
            )
        )
        equation.add(Equation("Momentum", "Mechanics", R.drawable.e_momentum, "p: Momentum \nm: Mass \nv: Velocity"))
        equation.add(
            Equation(
                "Conservation of Momentum",
                "Mechanics",
                R.drawable.e_lawofmomentum,
                "u: Velocity before \nv: Velocity after \nm: Mass"
            )
        )
        equation.add(Equation("Work", "Mechanics", R.drawable.e_work, "W: Work \nF: Force \ns: Displacement"))
        equation.add(
            Equation(
                "Potential Energy",
                "Mechanics",
                R.drawable.e_potentialenergy,
                "e(p): Potential Energy \nm: Mass \ng: Gravitational Acceleration \nh: Height"
            )
        )
        equation.add(
            Equation(
                "Kinetic Energy",
                "Mechanics",
                R.drawable.e_kineticenergy,
                "e(k): Kinetic Energy \nm: Mass \nv: Velocity"
            )
        )
        equation.add(
            Equation(
                "Elastic Energy",
                "Mechanics",
                R.drawable.e_elasticeergy,
                "e(elastic): Elastic Energy \nk: Spring Constant \nl(delta): Spring Displacement"
            )
        )
        equation.add(
            Equation(
                "Centripetal Force",
                "Mechanics",
                R.drawable.e_centripetalforce,
                "F(c): Centripetal Force \nm: Mass \na(c): Centripetal Acceleration"
            )
        )
        equation.add(
            Equation(
                "Centripetal Acceleration",
                "Mechanics",
                R.drawable.e_centripetalacceleration,
                "a(c): Centripetal Acceleration \nv: Velocity \nr: Radius Acceleration \nT: Period \nw: Angular Velocity"
            )
        )
        equation.add(
            Equation(
                "Harmonic Oscillator #1",
                "Mechanics",
                R.drawable.e_harmonicoscillator1,
                "T: Time Period \nm: Mass \nk: Spring Constant"
            )
        )
        equation.add(
            Equation(
                "Harmonic Oscillator #2",
                "Mechanics",
                R.drawable.e_harmonicoscillator2,
                "y: Elongation \nA: Amplitude \nT: Time Period \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Harmonic Oscillator #3",
                "Mechanics",
                R.drawable.e_harmonicoscillator_3,
                "v: Velocity \nA: Amplitude \nT: Time Period \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Harmonic Oscillator #4",
                "Mechanics",
                R.drawable.e_harmonicoscillator_4,
                "a: Acceleration \nA: Amplitude \nT: Time Period \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Simple Pendulum",
                "Mechanics",
                R.drawable.e_simplependulum,
                "T: Time Period \nl: Pendulum length \ng: Gravitational Acceleration"
            )
        )
        equation.add(
            Equation(
                "Mass-energy Equivalence",
                "Theory of Relativity",
                R.drawable.e_massenergy,
                "E: Energy \nm: Mass \nc: Speed of Light"
            )
        )
        equation.add(
            Equation(
                "Thermal Energy",
                "Thermodynamics",
                R.drawable.e_thermalenergy,
                "E(T): Thermal Energy \nc: Specific Heat Capacity \nT: Change in Temperature"
            )
        )
        equation.add(
            Equation(
                "Latent Energy (Fusion)",
                "Thermodynamics",
                R.drawable.e_latentenergyfus,
                "E(f): Fusion Energy \nm: Mass \nl(f): Fusion Heat"
            )
        )
        equation.add(
            Equation(
                "Latent Energy (Vaporization)",
                "Thermodynamics",
                R.drawable.e_latentenergyvap,
                "E(v): Vaporization Energy \nm: Mass \nl(f): Vaporization Heat"
            )
        )
        equation.add(
            Equation(
                "Ideal Gas Law",
                "Thermodynamics",
                R.drawable.e_idealenergy,
                "p: Pressure \nV: Volume \nT: Temperature"
            )
        )
        equation.add(Equation("Pressure", "Thermodynamics", R.drawable.e_pressure, "p: Pressure \nF: Force \nA: Area"))
        equation.add(
            Equation(
                "Pressure in Liquids",
                "Thermodynamics",
                R.drawable.e_liquidpressure,
                "p: Pressure \np: Liquid Density \nG: Gravitational Acceleration \nh: Height"
            )
        )
        equation.add(
            Equation(
                "Lift Force",
                "Thermodynamics",
                R.drawable.e_liftforce,
                "F(L): Lift Force \np: Density \ng: Gravitational Acceleration \nV: Volume"
            )
        )
        equation.add(
            Equation(
                "Velocity Factor (Propagation Speed)",
                "Wavelengths",
                R.drawable.e_velocityfactor,
                "v: Wavelengths propagation speed \nLambda: wavelength \nf: Frequency"
            )
        )
        equation.add(
            Equation(
                "Light Interference (Double Slit)",
                "Wavelengths",
                R.drawable.e_lightinterference,
                "a: Angel between light-maxima and central-maximum \nLambda: wavelength \nn: Light-maxima's sorting-number. \nd: Double Slit constant"
            )
        )
        equation.add(
            Equation(
                "Law of Refraction",
                "Wavelengths",
                R.drawable.e_lawofrefraction,
                "i: Angle \nb: Refraction Angle \nv: Wavelength's propagation-speed"
            )
        )
        equation.add(
            Equation(
                "Emittance",
                "Wavelengths",
                R.drawable.e_emittance,
                "M(e): Emittance \nP: Effect \nT: Temperature"
            )
        )
        equation.add(
            Equation(
                "Stefan-Boltzmanns Law",
                "Wavelengths",
                R.drawable.e_stefanboltzmann,
                "M(e): Emittance \no: Stefan-Boltzmanns Constant \nT: Temperature"
            )
        )
        equation.add(
            Equation(
                "Wiens Displacement Law",
                "Wavelengths",
                R.drawable.e_wiens,
                "Lambda(max): Wavelength at radience-maximum \nT: Temperature \nb: Wiens displacement constant"
            )
        )
        equation.add(
            Equation(
                "Coulombs Law",
                "Electricity",
                R.drawable.e_coulombs,
                "F(E): Electrical Force \nk: Coulombs Constant \nQ: Charge \nr: Distance"
            )
        )
        equation.add(Equation("Current", "Electricity", R.drawable.e_current, "I: Current \nQ: Charge \nt: Time"))
        equation.add(
            Equation(
                "Electrical Voltage",
                "Electricity",
                R.drawable.e_electricalvoltage,
                "U: Voltage \nE: Energy \nQ: Charge"
            )
        )
        equation.add(
            Equation(
                "Ohms Law",
                "Electricity",
                R.drawable.e_ohmslaw,
                "I: Current \nU: Voltage \nR: Resistance"
            )
        )
        equation.add(
            Equation(
                "Electrical Effect",
                "Electricity",
                R.drawable.e_electricaleffect,
                "P: Effect \nU: Voltage \nI: Current"
            )
        )
        equation.add(
            Equation(
                "Electrical Field Strength",
                "Electricity",
                R.drawable.e_electricalfieldstrenght,
                "E: Electrical Field Strength \nU: Voltage \nd: Distance"
            )
        )
        equation.add(
            Equation(
                "Force Charge on Particle in Electric Field",
                "Electricity",
                R.drawable.e_chargeparticle,
                "F(E): Electrical Force \nE: Electrical Field Strength \nQ: Charge Amount"
            )
        )
        equation.add(Equation("Equivalent Resistance (Series)", "Electricity", R.drawable.e_seriesresistance, ""))
        equation.add(Equation("Equivalent Resistance (Parallel)", "Electricity", R.drawable.e_parallelresistance, ""))
        equation.add(
            Equation(
                "Magnetic Field around electrical conduct",
                "Magnetism and Induction",
                R.drawable.e_magneticfieldelectricalconduct,
                "B: Magnetic Flow \nu(0): Permeability in vacuum \nI: current \na: distance from conduct"
            )
        )
        equation.add(
            Equation(
                "Magnetic Field in flat coil",
                "Magnetism and Induction",
                R.drawable.e_magneticfieldflat,
                "B: Magnetic Flow \nu(0): Permeability in vacuum \nI: current \nN: Amount of laps \nr: Radius of coil"
            )
        )
        equation.add(
            Equation(
                "Magnetic Field in solenoid",
                "Magnetism and Induction",
                R.drawable.e_magneticfieldsolenoid,
                "B: Magnetic Flow Density\nu(0): Permeability in vacuum \nI: current \na: Length of solenoid"
            )
        )
        equation.add(
            Equation(
                "Power Effect on conductor in magnetic field",
                "Magnetism and Induction",
                R.drawable.e_powereffectconductor,
                "F(B): Magnetic Force Density\nB: Flow \nI: current \nl: Length"
            )
        )
        equation.add(
            Equation(
                "Power Effect on charged particle in magnetic field",
                "Magnetism and Induction",
                R.drawable.e_powereffectcharged,
                "F(B): Magnetic Force \nB: Flow Fensity\nQ: Charge \nv: Velocity"
            )
        )
        equation.add(
            Equation(
                "Magnetic Flow",
                "Magnetism and Induction ",
                R.drawable.e_powereffectcharged,
                "o: Magnetic Flow \nB: Flow Density\nA: Area"
            )
        )
        equation.add(
            Equation(
                "Induced Voltage (Moving Conductor)",
                "Magnetism and Induction",
                R.drawable.e_inducedvoltagemoving,
                "U: Induced Voltage \nB: Flow Density\nl: Length \nv: Velocity"
            )
        )
        equation.add(
            Equation(
                "Induced Voltage (Variable Magnetic Flow)",
                "Magnetism and Induction",
                R.drawable.e_inducedvoltagevariable,
                "U: Induced Voltage \no: Change of magnetic flow\nt: Time Period"
            )
        )
        equation.add(
            Equation(
                "Transformer",
                "Magnetism and Induction",
                R.drawable.e_transformer,
                "U: Induced Voltage \nN: Rounds Count\nI: Current \np: Primary Side \ns: Secondary Side"
            )
        )
        equation.add(
            Equation(
                "Photon Energy",
                "Atomic Physics",
                R.drawable.e_photonenergy,
                "E(photon): Photon Energy \nh: Plancks Constant\nf: Frequency \nc: Speed of Light \nLambda: Wavelength"
            )
        )
        equation.add(
            Equation(
                "Photoelectric Effect",
                "Atomic Physics",
                R.drawable.e_photoelectriceffect,
                "E(photon): Photon Energy \nE(0): Exit-work\nE(k): Kinetic Energy"
            )
        )
        equation.add(
            Equation(
                "Photon Momentum",
                "Atomic Physics",
                R.drawable.e_photonmomentum,
                "p: Momentum \nh: Plancks Constant \nLambda: Wavelength"
            )
        )
        equation.add(
            Equation(
                "Matter Wavelength (de Broglie)",
                "Atomic Physics",
                R.drawable.e_matterwave,
                "Lambda: Wavelength \nh: Plancks Constant \nm: Mass \nv: Velocity"
            )
        )
        equation.add(
            Equation(
                "Hydrogen's energy levels (Bohrs)",
                "Atomic Physics",
                R.drawable.e_hydrogenenergylevels,
                "E(n): Energy level at orbital n \nn: Orbital Number"
            )
        )
        equation.add(
            Equation(
                "Law of Decay",
                "Nuclear Physics",
                R.drawable.e_lawofdecay,
                "N: Number of nucleus at time t at orbital n \nN(0): Number of nucleus at time 0 \nLambda: Decay Constant \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Half-Life",
                "Nuclear Physics",
                R.drawable.e_halflife,
                "T(1/2): Half-life \nLambda: Decay Constant"
            )
        )
        equation.add(
            Equation(
                "Activity #1",
                "Nuclear Physics",
                R.drawable.e_activity1,
                "A: Activity \nlambda: Decay Constant \nN: Number of nucleus"
            )
        )
        equation.add(
            Equation(
                "Activity #2",
                "Nuclear Physics",
                R.drawable.e_activity2,
                "A: Activity at time 0 \nA(0): Activity at time 0 \nlambda: Decay Constant \nt: Time"
            )
        )
        equation.add(
            Equation(
                "Absorbed Dose",
                "Nuclear Physics",
                R.drawable.e_absorbeddose,
                "D: Absorbed Dose \nE: Energy \nm: Mass"
            )
        )
        equation.add(
            Equation(
                "Equivalent Dose",
                "Nuclear Physics",
                R.drawable.e_equivalentdose,
                "H: Equivalent Dose \nD: Absorbed Dose \nQ: Quality Factor"
            )
        )
        equation.add(Equation("Energy in Capacitor", "Electricity", R.drawable.e_equivalentdose, ""))

    }
}
