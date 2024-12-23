package com.system_design_repo.llds.parking_lot_lld.service;


import com.system_design_repo.llds.parking_lot_lld.enumType.SlotType;

import java.util.HashMap;
import java.util.Map;

public class PricingService {

    private Map<SlotType, Integer> pricingMap;

    public PricingService() {
        pricingMap = new HashMap<>();
        pricingMap.put(SlotType.COMPACT, 20);
        pricingMap.put(SlotType.STANDARD, 30);
        pricingMap.put(SlotType.LARGE, 40);
    }

    public int getPricing(SlotType type) {
        return pricingMap.getOrDefault(type, 0);
    }

}
