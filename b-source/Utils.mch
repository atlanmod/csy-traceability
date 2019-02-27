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
    Utils

CONCRETE_VARIABLES
    // variables to be declared in the .h, defined and used in handmade .c files
    current_date, current_time, toprint

INVARIANT
    current_date: INT & current_time: INT & toprint: BOOL

INITIALISATION
    current_date:: INT || current_time:: INT || toprint:: BOOL

CONCRETE_CONSTANTS
    // inputs (speed and position) are 16-bit integers
    UINT16_MAX, uint16_t

PROPERTIES
    UINT16_MAX: NAT1 &
    uint16_t = 0..UINT16_MAX

ASSERTIONS
    uint16_t <: INT

OPERATIONS
    
    print(sensor, var, value) =
    PRE
        sensor : STRING &
        var : STRING &
        value : STRING
    THEN
        skip
    END
    ;

    urgent_print(sensor, variable, value) =
    PRE
        sensor : STRING &
        variable : STRING &
        value : STRING
    THEN
        skip
    END
    ;

    flush = skip
    

END
