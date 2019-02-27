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
    Doors

SEES
    Inputs

DEFINITIONS
    DOOR_SENSOR_CONSISTENT(visible, opening, closed, closing) == ((visible = FALSE => (opening = FALSE & closed = FALSE & closing = FALSE)) &
                                                                  (opening = TRUE => (closed = FALSE & closing = FALSE)) &
                                                                  (closed = TRUE => (opening = FALSE & closing = FALSE)) &
                                                                  (closing = TRUE => (opening = FALSE & closed = FALSE)))

OPERATIONS

    // tell whether doors are opening
    // doors cannot open when sensors data are not consistent
    opening <-- are_doors_opening =
    BEGIN
        opening :( opening: BOOL & ((opening = TRUE) => (DOOR_SENSOR_CONSISTENT(PorteVisible_M22, OuverturePorte_M22, FermeturePorte_M22, PorteFerme_M22) & DOOR_SENSOR_CONSISTENT(PorteVisible_M23, OuverturePorte_M23, FermeturePorte_M23, PorteFerme_M23))) )
    END

END
