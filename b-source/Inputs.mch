// Copyright (C) 2018 Clearsy
//
// This file is part of MockPilot.
//
// MockPilot is free software; you can redistribute it and/or modify it
// under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 3 of the License, or
// (at your option) any later version.
//
// MockPilot is distributed in the hope that it will be useful, but WITHOUT
// ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
// or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public
// License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

MACHINE
    Inputs

SEES
    Utils

CONCRETE_VARIABLES
    /* the input variables from sensors */
    Position_M21,    // in mm
    Speed_M21,       // in 1/100 km/h 
    
    PorteVisible_M22,
    OuverturePorte_M22,
    FermeturePorte_M22,
    PorteFerme_M22,
    
    PorteVisible_M23,
    OuverturePorte_M23,
    FermeturePorte_M23,
    PorteFerme_M23,
    
    Position_M24,
    Speed_M24

INVARIANT
    Position_M21: uint16_t &
    Speed_M21: uint16_t &
    
    PorteVisible_M22: BOOL &
    OuverturePorte_M22: BOOL &
    FermeturePorte_M22: BOOL &
    PorteFerme_M22: BOOL &
    
    PorteVisible_M23: BOOL &
    OuverturePorte_M23: BOOL &
    FermeturePorte_M23: BOOL &
    PorteFerme_M23: BOOL &
    
    Position_M24: uint16_t &
    Speed_M24: uint16_t
    
INITIALISATION
    Position_M21 :: uint16_t ||
    Speed_M21 :: uint16_t ||
    
    PorteVisible_M22 :: BOOL ||
    OuverturePorte_M22 :: BOOL ||
    FermeturePorte_M22 :: BOOL ||
    PorteFerme_M22 :: BOOL ||
    
    PorteVisible_M23 :: BOOL ||
    OuverturePorte_M23 :: BOOL ||
    FermeturePorte_M23 :: BOOL ||
    PorteFerme_M23 :: BOOL ||
    
    Position_M24 :: uint16_t ||
    Speed_M24 :: uint16_t
    
OPERATIONS
    get_inputs =
    BEGIN
        Position_M21 :: uint16_t ||
        Speed_M21 :: uint16_t ||
        
        PorteVisible_M22 :: BOOL ||
        OuverturePorte_M22 :: BOOL ||
        FermeturePorte_M22 :: BOOL ||
        PorteFerme_M22 :: BOOL ||
        
        PorteVisible_M23 :: BOOL ||
        OuverturePorte_M23 :: BOOL ||
        FermeturePorte_M23 :: BOOL ||
        PorteFerme_M23 :: BOOL ||
        
        Position_M24 :: uint16_t ||
        Speed_M24 :: uint16_t
    END
END
