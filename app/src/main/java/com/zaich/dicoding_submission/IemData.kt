package com.zaich.dicoding_submission

object IemData {
    private val iemName = arrayOf(
        "AirPod",
        "BLON BL03",
        "Ibasso It 01",
        "KBEAR S2",
        "KZ Zsn",
        "Moondrop SSR",
        "Sony MDR-XB55AP",
        "Tin T2",
        "Trn V90",
        "Ak Rock Space"
    )

    private val iemDetails = arrayOf(
        "Specifications  :\n" +
                "\n" +
                "In-ear design allows them to fit more people’s ears\n" +
                "Better sound quality than other AirPods\n" +
                "Noise cancellation is surprisingly effective\n" +
                "Deep software integration with iOS",
        "Specifications:\n" +
                "\n" +
                "Name: BLON BL-03\n" +
                "Earphone type: In-ear\n" +
                "Driver unit: 10mm Carbon Diaphragm Dynamic Drive\n" +
                "Impedance: 32Ω\n" +
                "Earphone sensitivity: 102dB/mW\n" +
                "Frequency range: 20-20000Hz\n" +
                "Interface: 3.5mm Gilded\n" +
                "Plug Type: L curved\n" +
                "Cable Length: 1.2m±3cm\n" +
                "Interface: 2Pin 0.78MM  connector\n" +
                "Microphone: Yes\n" +
                "Detachable Cable: Yes",
        "Specifications :\n" +
                "\n" +
                "Driver10.0mm Dynamic driver\n" +
                "Multi layered graphene, which is Ultra-light and stiff.\n" +
                "Frequency response: 10Hz-42kHz\n" +
                "Impedance: 16 Ohm\n" +
                "Noise Attenuation: -26dB\n" +
                "Rated power: 10mW\n" +
                "T.H.D.: 1 % (at 1kHz/1mW)\n" +
                "Plug size: 3.5 TRS gold plated\n" +
                "Cable length: 1.2m\n" +
                "Connection: MMCX\n" +
                "Weight: 8.0g without cable\n" +
                "Package\n" +
                "IT01 IEM\n" +
                "3 pairs of silicone eartips(S/M/L)\n" +
                "carry case\n" +
                "S/M foam eartips",
        "Specifications :\n" +
                "\n" +
                "Model : KS2\n" +
                "Interface : 0.78mm 2 Pin\n" +
                "Frequency range: 20 - 20kHZ\n" +
                "Sensitivity : 106±3dB\n" +
                "Impedance : 16Ω\n" +
                "Material : Environment protect PC\n" +
                "Whether with mic : Yes\n" +
                "Plug : 3.5mm L curve gold plated connector\n" +
                "Drive Unit : Hybrid 10mm composite diaphragm Dynamic Driver + Balanced Armature\n" +
                "Cable : 4 Core OFC high-purity pure copper cable",
        "Specifications :\n" +
                "\n" +
                "Product Name: Original KZ ZSN PROX In-ear Earphone\n" +
                "Brand: KZ\n" +
                "Model: ZSN PROX\n" +
                "Earphone type: In-ear\n" +
                "Impedance: 250\n" +
                "Earphone sensitivity: 112dB/mW\n" +
                "Frequency range: 7-40000 Hz\n" +
                "Interface: 3.5mm Gilded\n" +
                "Plug Type: L curved\n" +
                "Cable Length: 1.2m+3cm\n" +
                "Color: Gold, Black, Royal blue\n" +
                "Whether with cable: Yes\n" +
                "Earphone interface: 2 Pin connector\n" +
                "Whether with mic: Mic\n" +
                "Whether can replacement cable: Yes " +
                "Driver unit: 1BA+1DD hybrid driver unit (10mm DD*1+30095 BA*1)",
        "Specifications :\n" +
                "\n" +
                "Frequency Response: 20-20000HZ (EC60318-4) / 20-40000Hz (% Inch Free field MIc)\n" +
                "Impedance: 16ohm@l000Hz\n" +
                "THD:<=1%\n" +
                "Housing Material: Liquid Metal AIIoy Housing\n" +
                "Disphragm: BeryIIium-Coated Dome+PU suspension Ring\n" +
                "Coil: 0.035mm-CCAW (Daikoku)\n" +
                "Magnet: N52-High Density Magnetic Circuit\n" +
                "Acoustic Fiter: Platented Anti-blocking Filter\n" +
                "Cable: Silver Plated 4N-Litz OFC\n" +
                "Connectors: 0.78 - 2 Pin",
        "Specifications :\n" +
                "\n" +
                "Headphones made for Electronic Dance Music (EDM)\n" +
                "In-line mic for hands-free phone calling\n" +
                "12 mm neodymium drivers for powerful extra bass sound\n" +
                "Shiny metallic finish housing\n" +
                "Comfortable, secure-fitting silicone earbuds for long listening hours\n" +
                "Carrying pouch supplied\n" +
                "Serrated tangle free cord",
        "Specifications :\n" +
                "\n" +
                "Brand: Tin Audio\n" +
                "Model: T2\n" +
                "Driver: dynamic 10mm woofer + 6mm tweeter\n" +
                "Impedance: 16\n" +
                "Frequency response range: 12-40000Hz\n" +
                "Earphone interface\"\"'MMCX\n" +
                "Plug: 3.5mm Carbon fiber gold-plated straight plug,\n" +
                "Cable: 1.2M 5N oxygen free copper silver-plated wire",
        "Specifications :\n" +
                "\n" +
                "Product Name: TRN V90s 1DD+5BA Hybrid Metal In Ear Earphone\n" +
                "Brand: TRN\n" +
                "Model: TRN V90S\n" +
                "Earphone type: In-ear\n" +
                "Impedance: 22Ω\n" +
                "Earphone sensitivity: 108dB/mW\n" +
                "Frequency range: 20-20000Hz\n" +
                "Plug Type : 3.5mm L Plug\n" +
                "Cable Length: 1.25m\n" +
                "Color: Red, Black\n" +
                "Whether with cable: Yes\n" +
                "Earphone interface: QDC Interface\n" +
                "Whether with mic: Optional\n" +
                "Whether can replacement cable: Yes\n" +
                "Driver unit: 5BA+1DD hybrid driver unit (10MM Dual-Magnet High-Flux Dynamic Driver )",
        "Specifications :\n" +
                "\n" +
                "Brand: rock space\n" +
                "Plug Type: 3.5mm jack\n" +
                "Length:\n" +
                "Model No.:\n" +
                "Material: ABS, PVC, Ceramic\n" +
                "Weight: Appr. 21g\n" +
                "Click once: Play/ pause music\n" +
                "Call: Short press to answer/ Long press to reject\n" +
                "Click twice: Next track\n" +
                "Click three times: Previous track\n" +
                "Nylon braided material is wear-resistant and tangle-free."
    )

    private val iemImages = intArrayOf(
        R.drawable.apple,
        R.drawable.blo03,
        R.drawable.ibassoit01,
        R.drawable.kbs2,
        R.drawable.kzzsn,
        R.drawable.moondropssr,
        R.drawable.sony,
        R.drawable.tint2,
        R.drawable.trnv90,
        R.drawable.rockspace
    )

    private val iemHarga = arrayOf(
        1500000,
        350000,
        1500000,
        290000,
        250000,
        750000,
        500000,
        750000,
        450000,
        150000
    )

    val listData: ArrayList<IemModel>
        get() {
            val list = arrayListOf<IemModel>()
            for (position in iemName.indices) {
                val iem = IemModel()
                iem.nmIem= iemName[position]
                iem.descIem = iemDetails[position]
                iem.imageIem = iemImages[position]
                iem.hargaIem = iemHarga[position]
                list.add(iem)
            }
            return list
        }
}