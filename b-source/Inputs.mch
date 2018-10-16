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
    M21_Position,    // in mm
    M21_Speed,       // in 1/100 km/h 
    
    M22_DoorsVisible,
    M22_DoorsOpening,
    M22_DoorsClosing,
    M22_DoorsClosed,
    
    M23_DoorsVisible,
    M23_DoorsOpening,
    M23_DoorsClosing,
    M23_DoorsClosed,
    
    M24_Position,
    M24_Speed

INVARIANT
    M21_Position: uint16_t &
    M21_Speed: uint16_t &
    
    M22_DoorsVisible: BOOL &
    M22_DoorsOpening: BOOL &
    M22_DoorsClosing: BOOL &
    M22_DoorsClosed: BOOL &
    
    M23_DoorsVisible: BOOL &
    M23_DoorsOpening: BOOL &
    M23_DoorsClosing: BOOL &
    M23_DoorsClosed: BOOL &
    
    M24_Position: uint16_t &
    M24_Speed: uint16_t
    
INITIALISATION
    M21_Position :: uint16_t ||
    M21_Speed :: uint16_t ||
    
    M22_DoorsVisible :: BOOL ||
    M22_DoorsOpening :: BOOL ||
    M22_DoorsClosing :: BOOL ||
    M22_DoorsClosed :: BOOL ||
    
    M23_DoorsVisible :: BOOL ||
    M23_DoorsOpening :: BOOL ||
    M23_DoorsClosing :: BOOL ||
    M23_DoorsClosed :: BOOL ||
    
    M24_Position :: uint16_t ||
    M24_Speed :: uint16_t
    
OPERATIONS
    get_inputs =
    BEGIN
        M21_Position :: uint16_t ||
        M21_Speed :: uint16_t ||
        
        M22_DoorsVisible :: BOOL ||
        M22_DoorsOpening :: BOOL ||
        M22_DoorsClosing :: BOOL ||
        M22_DoorsClosed :: BOOL ||
        
        M23_DoorsVisible :: BOOL ||
        M23_DoorsOpening :: BOOL ||
        M23_DoorsClosing :: BOOL ||
        M23_DoorsClosed :: BOOL ||
        
        M24_Position :: uint16_t ||
        M24_Speed :: uint16_t
    END
END
